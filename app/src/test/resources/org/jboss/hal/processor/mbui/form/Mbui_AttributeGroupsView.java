package org.jboss.hal.processor.mbui.form;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Inject;

import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.builder.ElementsBuilder;
import org.jboss.gwt.elemento.core.Elements;
import org.jboss.gwt.elemento.template.TemplateUtil;
import org.jboss.hal.ballroom.form.Form;
import org.jboss.hal.ballroom.table.Scope;
import org.jboss.hal.ballroom.LayoutBuilder;
import org.jboss.hal.ballroom.autocomplete.ReadChildrenAutoComplete;
import org.jboss.hal.core.mbui.dialog.AddResourceDialog;
import org.jboss.hal.core.mbui.form.GroupedForm;
import org.jboss.hal.core.mbui.form.ModelNodeForm;
import org.jboss.hal.core.mbui.table.ModelNodeTable;
import org.jboss.hal.core.mbui.MbuiContext;
import org.jboss.hal.dmr.Operation;
import org.jboss.hal.dmr.ResourceAddress;
import org.jboss.hal.meta.AddressTemplate;
import org.jboss.hal.meta.Metadata;
import org.jboss.hal.meta.security.Constraint;
import org.jboss.hal.resources.Ids;
import org.jboss.hal.spi.Message;
import org.jboss.hal.spi.MessageEvent;

import static java.util.Arrays.asList;
import static org.jboss.gwt.elemento.core.Elements.*;
import static org.jboss.hal.ballroom.LayoutBuilder.column;
import static org.jboss.hal.ballroom.LayoutBuilder.row;
import static org.jboss.hal.dmr.ModelDescriptionConstants.ADD;
import static org.jboss.hal.dmr.ModelDescriptionConstants.READ_RESOURCE_OPERATION;

/*
 * WARNING! This class is generated. Do not modify.
 */
@Generated("org.jboss.hal.processor.mbui.MbuiViewProcessor")
public final class Mbui_AttributeGroupsView extends AttributeGroupsView {

    private final Metadata metadata0;
    private final Map<String, HTMLElement> expressionElements;

    @Inject
    @SuppressWarnings("unchecked")
    public Mbui_AttributeGroupsView(MbuiContext mbuiContext) {
        super(mbuiContext);

        AddressTemplate metadata0Template = AddressTemplate.of("/subsystem=foo");
        this.metadata0 = mbuiContext.metadataRegistry().lookup(metadata0Template);
        this.expressionElements = new HashMap<>();

        form = new GroupedForm.Builder<org.jboss.hal.dmr.ModelNode>("form", metadata0)
                .customGroup("group-1", "Group 1")
                .include("foo", "bar")
                .end()
                .customGroup("group-2", "Group 2")
                .include("baz", "qux")
                .end()
                .onSave((form, changedValues) -> saveSingletonForm("Form",
                        metadata0Template.resolve(statementContext()), changedValues, metadata0))
                .prepareReset(form -> resetSingletonForm("Form", metadata0Template.resolve(statementContext()), form,
                        metadata0))
                .build();

        HTMLElement html0;
        HTMLElement root = row()
                .add(column()
                        .add(html0 = div()
                                .innerHtml(SafeHtmlUtils.fromSafeConstant("<h1>Form</h1>"))
                                .get())
                        .add(form)
                )
                .get();
        expressionElements.put("html0", html0);

        registerAttachable(form);

        initElement(root);
    }

    @Override
    public void attach() {
        super.attach();
    }
}
