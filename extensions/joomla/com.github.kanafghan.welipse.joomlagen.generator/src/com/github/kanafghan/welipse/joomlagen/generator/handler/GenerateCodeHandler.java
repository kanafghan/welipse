package com.github.kanafghan.welipse.joomlagen.generator.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.generator.JComponentGenerator;

public class GenerateCodeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		JoomlaGenModel genModel = null;
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof ITreeSelection) {
			ITreeSelection tree = (ITreeSelection) selection;
			if (!tree.isEmpty()) {
				Object element = tree.getFirstElement();
				if (element instanceof JoomlaGenModel) {
					genModel = (JoomlaGenModel) element;
					JComponentGenerator.generate(genModel);
				}
			}
		}
		
		return null;
	}

}
