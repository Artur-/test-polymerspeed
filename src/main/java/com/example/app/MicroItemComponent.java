package com.example.app;

import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H1;

@Tag("microitem-component")
@JsModule("./microitem-component.js")
public class MicroItemComponent extends PolymerTemplate<MicroItemComponent.MacroItemComponentModel> implements HasStyle, HasSize {

	
	public interface MacroItemComponentModel extends TemplateModel {

    }
	
	@Id("property")
	private H1 property;
	@Id("title")
	private H3 title;

	public MicroItemComponent() {
		
	}
	
	public void setContent(String title1, String prop1)
	{
		this.title.setText(title1);
		this.property.setText(prop1);
	}
	
	public void setTitle(String title)
	{
		this.title.setText(title);
	}
	
	public void setProperty(String prop)
	{
		this.property.setText(prop);
	}
	
	public void setPropertyColor(String color)
	{
		this.property.getElement().getStyle().set("color", color);
	}

	public void setPropertyColorDefault()
	{
		this.property.getElement().getStyle().remove("color");
	}
	
}