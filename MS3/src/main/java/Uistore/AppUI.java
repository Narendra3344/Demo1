package Uistore;

import org.openqa.selenium.By;

public class AppUI {
	public By covid = By.xpath("//*[@id=\"popupmsgID\"]/tbody/tr/td[1]/a");
	public By search = By.xpath("//*[@id='togglesearch']");
	public By searchBox = By.xpath("//*[@id=\"srch\"]");
	public By searchButton = By.xpath("//*[@id=\"submit_search\"]");
	public By searchResult = By.xpath("//*[@id='block-system-main']/div/ol/li[1]/h3/a");
	public By about = By.xpath("//*[@id='navcss']/li[2]/a");
	public By  corporate = By.xpath("//*[@id=\'navcss\']/li[2]/ul/li[2]/a");
	public By corpo = By.xpath("//*[@id=\'node-227\']/div[1]/div/div/div/div/h5[2]");
	public By services = By.xpath("//*[@id=\'footer-wrapper\']/footer/div/div/div[10]/ul/li[1]/a");
	public By heading = By.xpath("//*[@id=\'block-system-main\']/div/h2");

}

