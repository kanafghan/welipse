package com.github.kanafghan.welipse.joomlagen.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;

import com.github.kanafghan.welipse.joomlagen.presentation.JoomlaGenModelWizard;

public class ReloadGenModelHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof ITreeSelection) {
			ITreeSelection tree = (ITreeSelection) selection;
			if (!tree.isEmpty()) {
				Object element = tree.getFirstElement();
				if (element instanceof IFile) {
					IFile file = (IFile) element;
					IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench();
					Shell shell = workbench.getActiveWorkbenchWindow().getShell();
					StructuredSelection structuredSelection = new StructuredSelection(file);
					
					// create the wizard
					JoomlaGenModelWizard wizard = new JoomlaGenModelWizard();
					wizard.init(workbench, structuredSelection);
					wizard.setWindowTitle("Reload");
					
					// launch the wizard
					WizardDialog wizardDialog = new WizardDialog(shell, wizard);
					wizardDialog.create();
					wizardDialog.getShell().setSize(Math.max(540, wizardDialog.getShell().getSize().x), 580);
					wizardDialog.open();
				}
			}
		}
		
		return null;
	}
}
