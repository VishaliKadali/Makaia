package pages.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.aventstack.extentreports.ExtentTest;
import lib.selenium.PreAndPost;

public class HomePage extends PreAndPost{

	public HomePage(EventFiringWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;	
		driver.switchTo().defaultContent();
		PageFactory.initElements(driver, this);
	}		

	public HomePage searchUsingFilter(String value) throws InterruptedException {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//shadowDOMClick("return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"#all\")");
		shadowDOMClick("return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"#d6e462a5c3533010cbd77096e940dd8c\")");
		Thread.sleep(3000);
		shadowDOMClick("return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu:nth-child(1)\").shadowRoot.querySelector(\"#filter\")");
		//shadowDOMClick("return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu:nth-child(1)\").shadowRoot.querySelector(\"#filter\")");
		Thread.sleep(3000);
		shadowDomtype(("return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu:nth-child(1)\").shadowRoot.querySelector(\"#filter\")"),value);
		//shadowDOMClick("return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu:nth-child(1)\").shadowRoot.querySelector(\"nav > div.sn-polaris-nav.d6e462a5c3533010cbd77096e940dd8c.can-animate.keyboard-navigatable > div.sn-tree-menu.sn-polaris-nav-content > div.sn-polaris-tab-content.-left.is-visible.can-animate > div > sn-collapsible-list:nth-child(1)\").shadowRoot.querySelector(\"div > div > ul > li:nth-child(1) > span > a > span > span.label > mark\");");
		return this; 
	}
	
	
	
	//This element is in shadowDOM - document.querySelector("div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1) > mark:nth-child(1)")
	@FindBy(linkText="Create New")
	//WebElement eleCreateNew = (WebElement) this.driver.executeScript("return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu.can-animate.is-main-menu.is-open\").shadowRoot.querySelector(\"nav > div.sn-polaris-nav.all.can-animate.keyboard-navigatable > div.sn-tree-menu.sn-polaris-nav-content > div.sn-polaris-tab-content.-left.is-visible.can-animate > div > sn-collapsible-list:nth-child(1)\").shadowRoot.querySelector(\"div > div > ul > li:nth-child(1) > span > a > span > span.label > mark\")");	
//	String eleCreateNew = "return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu.is-main-menu.is-pinned.can-animate\").shadowRoot.querySelector(\"nav > div.sn-polaris-nav.d6e462a5c3533010cbd77096e940dd8c.can-animate > div.super-filter-container.all-results-open > div.all-results-section > div > div.sn-polaris-tab-content.-left.is-visible.can-animate > div > sn-collapsible-list:nth-child(3)\").shadowRoot.querySelector(\"div > div > ul > li:nth-child(6) > span > a > span > span\")";
	String eleCreateNew = "return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu:nth-child(1)\").shadowRoot.querySelector(\"nav > div.sn-polaris-nav.d6e462a5c3533010cbd77096e940dd8c.can-animate > div.super-filter-container.all-results-open > div.all-results-section > div > div.sn-polaris-tab-content.-left.is-visible.can-animate > div > sn-collapsible-list:nth-child(1)\").shadowRoot.querySelector(\"div > div > ul > li:nth-child(1) > span > a > span > span.label > mark\")";
	public CreateNewIncident clickCreateNew() throws InterruptedException {		
		try {
			//Thread.sleep(8000);
			shadowDOMClick(eleCreateNew);
			//shadowMethod();
		
		//This Element is inside 5 nested shadow DOM.
				} catch (Exception e) {
		}
		return new CreateNewIncident(driver, test); 
	}	
	

	@FindBy(linkText="Open")
	//WebElement eleOpen;
	String scrollEle = "return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu:nth-child(1)\").shadowRoot.querySelector(\"nav > div.sn-polaris-nav.d6e462a5c3533010cbd77096e940dd8c.can-animate > div.super-filter-container.all-results-open\")";
	String All = "return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu:nth-child(1)\").shadowRoot.querySelector(\"nav > div.sn-polaris-nav.d6e462a5c3533010cbd77096e940dd8c.can-animate > div.super-filter-container.all-results-open > div.all-results-section > div > div.sn-polaris-tab-content.-left.is-visible.can-animate > div > sn-collapsible-list:nth-child(3)\").shadowRoot.querySelector(\"div > div > ul > li:nth-child(6) > span > a > span > span\")";
	String eleOpen = "return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu:nth-child(1)\").shadowRoot.querySelector(\"nav > div.sn-polaris-nav.d6e462a5c3533010cbd77096e940dd8c.can-animate > div.super-filter-container.all-results-open > div.results-section.section-open > div > div.sn-polaris-tab-content.-left.is-visible.can-animate > div > sn-collapsible-list\").shadowRoot.querySelector(\"ul > li > span > a > span > span\")";
	//String eleOpen =  "return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > sn-polaris-menu:nth-child(1)\").shadowRoot.querySelector(\"nav > div.sn-polaris-nav.d6e462a5c3533010cbd77096e940dd8c.can-animate > div.super-filter-container.all-results-open > div.all-results-section > div > div.sn-polaris-tab-content.-left.is-visible.can-animate > div > sn-collapsible-list:nth-child(1)\").shadowRoot.querySelector(\"div > div > ul > li:nth-child(1) > span > a > span > span.label > mark\")";
	public ListIncidents clickOpen() throws InterruptedException {	
		
		Thread.sleep(8000);
		//scrollToElement(scrollEle);
		//scroll();
		shadowDOMClick(eleOpen);
		return new ListIncidents(driver, test); 
	}	
	
}










