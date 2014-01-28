/**
 */
package com.github.kanafghan.welipse.webdsl.provider;

import com.github.kanafghan.welipse.webdsl.util.WebDSLAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebDSLItemProviderAdapterFactory extends WebDSLAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDSLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Website} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebsiteItemProvider websiteItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Website}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebsiteAdapter() {
		if (websiteItemProvider == null) {
			websiteItemProvider = new WebsiteItemProvider(this);
		}

		return websiteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Page} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageItemProvider pageItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageAdapter() {
		if (pageItemProvider == null) {
			pageItemProvider = new PageItemProvider(this);
		}

		return pageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.List} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListItemProvider listItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.List}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListAdapter() {
		if (listItemProvider == null) {
			listItemProvider = new ListItemProvider(this);
		}

		return listItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Text} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemProvider textItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAdapter() {
		if (textItemProvider == null) {
			textItemProvider = new TextItemProvider(this);
		}

		return textItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageItemProvider imageItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter() {
		if (imageItemProvider == null) {
			imageItemProvider = new ImageItemProvider(this);
		}

		return imageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.InternalLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalLinkItemProvider internalLinkItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.InternalLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalLinkAdapter() {
		if (internalLinkItemProvider == null) {
			internalLinkItemProvider = new InternalLinkItemProvider(this);
		}

		return internalLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.ExternalLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalLinkItemProvider externalLinkItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.ExternalLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalLinkAdapter() {
		if (externalLinkItemProvider == null) {
			externalLinkItemProvider = new ExternalLinkItemProvider(this);
		}

		return externalLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.VariableExp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableExpItemProvider variableExpItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.VariableExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableExpAdapter() {
		if (variableExpItemProvider == null) {
			variableExpItemProvider = new VariableExpItemProvider(this);
		}

		return variableExpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.VariableInitialization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableInitializationItemProvider variableInitializationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.VariableInitialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableInitializationAdapter() {
		if (variableInitializationItemProvider == null) {
			variableInitializationItemProvider = new VariableInitializationItemProvider(this);
		}

		return variableInitializationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.ArithmeticOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticOperationItemProvider arithmeticOperationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.ArithmeticOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArithmeticOperationAdapter() {
		if (arithmeticOperationItemProvider == null) {
			arithmeticOperationItemProvider = new ArithmeticOperationItemProvider(this);
		}

		return arithmeticOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.StructuralExp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralExpItemProvider structuralExpItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.StructuralExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructuralExpAdapter() {
		if (structuralExpItemProvider == null) {
			structuralExpItemProvider = new StructuralExpItemProvider(this);
		}

		return structuralExpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.ClassifierOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierOperationItemProvider classifierOperationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.ClassifierOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassifierOperationAdapter() {
		if (classifierOperationItemProvider == null) {
			classifierOperationItemProvider = new ClassifierOperationItemProvider(this);
		}

		return classifierOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.IntegerConstant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerConstantItemProvider integerConstantItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.IntegerConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerConstantAdapter() {
		if (integerConstantItemProvider == null) {
			integerConstantItemProvider = new IntegerConstantItemProvider(this);
		}

		return integerConstantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.StringConstant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringConstantItemProvider stringConstantItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.StringConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringConstantAdapter() {
		if (stringConstantItemProvider == null) {
			stringConstantItemProvider = new StringConstantItemProvider(this);
		}

		return stringConstantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.StringOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringOperationItemProvider stringOperationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.StringOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringOperationAdapter() {
		if (stringOperationItemProvider == null) {
			stringOperationItemProvider = new StringOperationItemProvider(this);
		}

		return stringOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.BooleanConstant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanConstantItemProvider booleanConstantItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.BooleanConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanConstantAdapter() {
		if (booleanConstantItemProvider == null) {
			booleanConstantItemProvider = new BooleanConstantItemProvider(this);
		}

		return booleanConstantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.BooleanOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanOperationItemProvider booleanOperationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.BooleanOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanOperationAdapter() {
		if (booleanOperationItemProvider == null) {
			booleanOperationItemProvider = new BooleanOperationItemProvider(this);
		}

		return booleanOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.ComparisonOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonOperationItemProvider comparisonOperationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.ComparisonOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComparisonOperationAdapter() {
		if (comparisonOperationItemProvider == null) {
			comparisonOperationItemProvider = new ComparisonOperationItemProvider(this);
		}

		return comparisonOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.RealConstant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealConstantItemProvider realConstantItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.RealConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealConstantAdapter() {
		if (realConstantItemProvider == null) {
			realConstantItemProvider = new RealConstantItemProvider(this);
		}

		return realConstantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.ActualParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualParameterItemProvider actualParameterItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.ActualParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActualParameterAdapter() {
		if (actualParameterItemProvider == null) {
			actualParameterItemProvider = new ActualParameterItemProvider(this);
		}

		return actualParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Group} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupItemProvider groupItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupAdapter() {
		if (groupItemProvider == null) {
			groupItemProvider = new GroupItemProvider(this);
		}

		return groupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Form} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormItemProvider formItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormAdapter() {
		if (formItemProvider == null) {
			formItemProvider = new FormItemProvider(this);
		}

		return formItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.TextInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextInputItemProvider textInputItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.TextInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextInputAdapter() {
		if (textInputItemProvider == null) {
			textInputItemProvider = new TextInputItemProvider(this);
		}

		return textInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Button} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonItemProvider buttonItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonAdapter() {
		if (buttonItemProvider == null) {
			buttonItemProvider = new ButtonItemProvider(this);
		}

		return buttonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.SelectionList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionListItemProvider selectionListItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.SelectionList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionListAdapter() {
		if (selectionListItemProvider == null) {
			selectionListItemProvider = new SelectionListItemProvider(this);
		}

		return selectionListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.FileInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileInputItemProvider fileInputItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.FileInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileInputAdapter() {
		if (fileInputItemProvider == null) {
			fileInputItemProvider = new FileInputItemProvider(this);
		}

		return fileInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.CustomAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomActionItemProvider customActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.CustomAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomActionAdapter() {
		if (customActionItemProvider == null) {
			customActionItemProvider = new CustomActionItemProvider(this);
		}

		return customActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Save} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaveItemProvider saveItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Save}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSaveAdapter() {
		if (saveItemProvider == null) {
			saveItemProvider = new SaveItemProvider(this);
		}

		return saveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Reset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetItemProvider resetItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Reset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResetAdapter() {
		if (resetItemProvider == null) {
			resetItemProvider = new ResetItemProvider(this);
		}

		return resetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.Cancel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CancelItemProvider cancelItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.Cancel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCancelAdapter() {
		if (cancelItemProvider == null) {
			cancelItemProvider = new CancelItemProvider(this);
		}

		return cancelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.ListExp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListExpItemProvider listExpItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.ListExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListExpAdapter() {
		if (listExpItemProvider == null) {
			listExpItemProvider = new ListExpItemProvider(this);
		}

		return listExpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.ListElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListElementItemProvider listElementItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.ListElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListElementAdapter() {
		if (listElementItemProvider == null) {
			listElementItemProvider = new ListElementItemProvider(this);
		}

		return listElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.kanafghan.welipse.webdsl.WebUtilExp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebUtilExpItemProvider webUtilExpItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.kanafghan.welipse.webdsl.WebUtilExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebUtilExpAdapter() {
		if (webUtilExpItemProvider == null) {
			webUtilExpItemProvider = new WebUtilExpItemProvider(this);
		}

		return webUtilExpItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (websiteItemProvider != null) websiteItemProvider.dispose();
		if (pageItemProvider != null) pageItemProvider.dispose();
		if (listItemProvider != null) listItemProvider.dispose();
		if (textItemProvider != null) textItemProvider.dispose();
		if (imageItemProvider != null) imageItemProvider.dispose();
		if (internalLinkItemProvider != null) internalLinkItemProvider.dispose();
		if (externalLinkItemProvider != null) externalLinkItemProvider.dispose();
		if (variableExpItemProvider != null) variableExpItemProvider.dispose();
		if (variableInitializationItemProvider != null) variableInitializationItemProvider.dispose();
		if (arithmeticOperationItemProvider != null) arithmeticOperationItemProvider.dispose();
		if (structuralExpItemProvider != null) structuralExpItemProvider.dispose();
		if (classifierOperationItemProvider != null) classifierOperationItemProvider.dispose();
		if (integerConstantItemProvider != null) integerConstantItemProvider.dispose();
		if (stringConstantItemProvider != null) stringConstantItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (stringOperationItemProvider != null) stringOperationItemProvider.dispose();
		if (booleanConstantItemProvider != null) booleanConstantItemProvider.dispose();
		if (booleanOperationItemProvider != null) booleanOperationItemProvider.dispose();
		if (comparisonOperationItemProvider != null) comparisonOperationItemProvider.dispose();
		if (realConstantItemProvider != null) realConstantItemProvider.dispose();
		if (actualParameterItemProvider != null) actualParameterItemProvider.dispose();
		if (groupItemProvider != null) groupItemProvider.dispose();
		if (formItemProvider != null) formItemProvider.dispose();
		if (textInputItemProvider != null) textInputItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (buttonItemProvider != null) buttonItemProvider.dispose();
		if (selectionListItemProvider != null) selectionListItemProvider.dispose();
		if (fileInputItemProvider != null) fileInputItemProvider.dispose();
		if (customActionItemProvider != null) customActionItemProvider.dispose();
		if (saveItemProvider != null) saveItemProvider.dispose();
		if (resetItemProvider != null) resetItemProvider.dispose();
		if (cancelItemProvider != null) cancelItemProvider.dispose();
		if (listExpItemProvider != null) listExpItemProvider.dispose();
		if (listElementItemProvider != null) listElementItemProvider.dispose();
		if (webUtilExpItemProvider != null) webUtilExpItemProvider.dispose();
	}

}
