package zap;

import static utiles.utiles.generateZapReport;
import static utiles.utiles.proxy;
import static utiles.utiles.waitTillPassiveScanCompleted;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ClientApiException;

import io.github.bonigarcia.wdm.WebDriverManager;
import stepdefinition.Bulk_Licenses;
import stepdefinition.Feature;
import stepdefinition.Logout;
import stepdefinition.Notifications;
import stepdefinition.OnDemandLicense;
import stepdefinition.Partner;
import stepdefinition.Plan;
import stepdefinition.Profile;
import stepdefinition.Setup;

public class MasterAdmindetails {
	WebDriver driver;
	Feature feature;
	Plan plan;
	Bulk_Licenses bulk;
	OnDemandLicense ondemand;
	Partner partner;
	Setup setup;
	Notifications notification;
	Profile profile;
	Logout logout;
	private final String urlToTest = "http://192.168.2.19:3000";

	@BeforeMethod
	public void setUp() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setProxy(proxy);
		chromeOptions.setAcceptInsecureCerts(true);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		feature = new Feature(driver);
		plan = new Plan(driver);
		bulk = new Bulk_Licenses(driver);
		ondemand = new OnDemandLicense(driver);
		partner = new Partner(driver);
		setup = new Setup(driver);
		notification = new Notifications(driver);
		profile = new Profile(driver);
		logout = new Logout(driver);
	}

	@Test
	public void Logindetails() throws InterruptedException {
		driver.get(urlToTest);
		feature.user_enters_valid_mobile_num();
		feature.user_enter_password();
		feature.user_click_on_proceed_button();
		feature.user_Enter_the_MFA_code();
		feature.user_click_proceed_button_for_MFA_code();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void EditingFeature() throws InterruptedException {
		Logindetails();
		feature.user_click_on_Features_page();
		feature.user_click_on_search_and_enter_the_feature_name_with_enter_button();
		feature.user_click_on_filter_by_platform();
		feature.click_on_all_in_platform_dropdown();
		feature.click_on_apply_button_for_platform();
		feature.click_on_clear_button();
		feature.Editing_Feature();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Add_Plan_with_Edition() throws InterruptedException {
		Logindetails();
		plan.click_on_plans_tab();
		plan.click_on_add_new_plan_button();
		plan.enter_the_edition_name_in_new_plan();
		plan.enter_the_reference_name_in_new_plan();
		plan.select_the_radiobutton_in_duration_tenure();
		plan.select_the_radiobutton_in_model();
		plan.enter_notes_in_new_plan();
		plan.click_on_next_button_in_add_new_plan_page();
		plan.select_all_checkbox_in_features_tab();
		plan.select_all_checkbox_in_add_on_features_tab();
		plan.select_all_checkbox_in_add_on_modules_tab();
		plan.click_on_next_button_in_plan_features_page();
		plan.click_on_next_button_in_feature_controls();
		plan.select_the_platforms_in_plans();
		plan.click_on_Submit_button_in_platform();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Add_Plan_with_package() throws InterruptedException {
		Logindetails();
		plan.click_on_plans_tab();
		plan.click_on_add_new_plan_button();
		plan.click_on_radio_button_of_package();
		plan.enter_the_package_name_in_new_plan();
		plan.enter_the_reference_name_in_new_plan_in_package_radiobutton();
		plan.select_the_edition_in_new_plan();
		plan.enter_notes_in_new_plan();
		plan.click_on_next_button_in_add_new_plan_page();
		plan.select_all_checkbox_in_features_tab();
		plan.select_all_checkbox_in_add_on_features_tab();
		plan.select_all_checkbox_in_add_on_modules_tab();
		plan.click_on_next_button_in_plan_features_page();
		plan.click_on_next_button_in_feature_controls();
		plan.select_the_platforms_in_plans();
		plan.click_on_Submit_button_in_platform();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Edit_Edition_Plan() throws InterruptedException {
		Logindetails();
		plan.click_on_plans_tab();
		plan.click_on_edit_icon_for_selected_plan();
		plan.click_on_edit_icon_in_plan_details();
		plan.enter_the_mfa_code_of_edit_plan_details_submit_the_details();
		plan.click_on_next_button_in_edit_plan();
		plan.click_on_next_button_in_plan_features_page();
		plan.click_on_next_button_in_edited_feature_controls();
		plan.click_on_Submit_button_in_edited_platform();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Edit_Package_Plan() throws InterruptedException {
		Logindetails();
		plan.click_on_plans_tab();
		plan.click_on_edit_icon_for_package_plan();
		plan.click_on_edit_icon_in_plan_details();
		plan.enter_the_mfa_code_of_edit_plan_details_submit_the_details();
		plan.click_on_next_button_in_edit_plan();
		plan.click_on_next_button_in_plan_features_page();
		plan.click_on_next_button_in_edited_feature_controls();
		plan.click_on_Submit_button_in_edited_platform();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void ClonePlan() throws InterruptedException {
		Logindetails();
		plan.click_on_plans_tab();
		plan.click_on_clone_button_for_plan();
		plan.enter_the_edition_name_in_clone();
		plan.enter_the_reference_name_in_clone();
		plan.select_the_radiobutton_in_duration_or_tenure_in_clone();
		plan.select_the_radiobutton_in_model_in_clone();
		plan.enter_the_notes_in_clone();
		plan.click_on_next_button_of_plan_details_in_clone();
		plan.click_on_next_button_of_plan_feature_in_clone();
		plan.click_on_next_button_of_feature_controls_in_clone();
		plan.click_on_Submit_button_in_platform();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void DeletingPlan() throws InterruptedException {
		Logindetails();
		plan.click_on_plans_tab();
		plan.click_on_delete_button_for_plan();
		plan.select_yes_button_in_popup_msg();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Trail_Bulk_License() throws Throwable {
		Logindetails();
		bulk.User_clicked_on_bulk_licenses();
		bulk.User_clicked_on_create_new_bulk_licenses();
		bulk.User_clicked_on_trial();
		bulk.User_clicked_on_add_new_partner_button();
		bulk.User_clicked_on_bulk_licenses();
		bulk.User_clicked_on_create_new_bulk_licenses();
		bulk.User_clicked_on_trial();
		bulk.User_clicked_on_7days_of_trial_period();
		bulk.User_clicked_on_30days_of_trial_period();
		bulk.User_clicked_on_2times_Trial_Date_Extension_Accept_Limit();
		bulk.User_clicked_on_partner_name_drop_down();
		bulk.User_clicked_search_box();
		bulk.User_selected_a_partner_name();
		bulk.User_clicked_on_Model_drop_down();
		bulk.User_selected_one_drop_down_option();
		bulk.User_clicked_on_edition_drop_down();
		bulk.User_select_the_edition_name();
		bulk.User_clicked_on_package_drop_down();
		bulk.User_clicked_on_all_checkbox_in_package();
		bulk.User_clicked_on_apply_button_in_package();
		bulk.User_clicked_on_Individual_Add_on_drop_down();
		bulk.User_clicked_on_all_checkbox_in_addons();
		bulk.User_clicked_on_apply_button_in_addons();
		bulk.User_started_entering_numeric();
		bulk.User_clicked_on_start_date_and_selected_a_paticular_date();
		bulk.User_clicked_on_end_date_and_selected_a_paticular_date();
		bulk.User_clicked_on_submit();
		bulk.User_enter_mfa_code_for_trail_license();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Subscription_Bulk_License() throws Throwable {
		Logindetails();
		bulk.User_clicked_on_bulk_licenses();
		bulk.User_clicked_on_create_new_bulk_licenses();
		bulk.User_clicked_on_subscription();
		bulk.User_clicked_on_add_new_partner_button();
		bulk.User_clicked_on_bulk_licenses();
		bulk.User_clicked_on_create_new_bulk_licenses();
		bulk.User_clicked_on_subscription();
		bulk.User_clicked_on_drop_down_of_partner_name_in_subscription();
		bulk.User_clicked_search_box();
		bulk.User_selected_a_partner_name();
		bulk.User_clicked_on_Model_drop_down_in_subscription();
		bulk.User_selected_one_drop_down_option();
		bulk.User_clicked_on_edition_drop_down_in_subscription();
		bulk.User_select_the_edition_name();
		bulk.User_clicked_on_package_drop_down_in_subscription();
		bulk.User_clicked_on_all_checkbox_in_package();
		bulk.User_clicked_on_apply_button_in_package();
		bulk.User_clicked_on_Individual_Add_on_drop_down_in_subscription();
		bulk.User_clicked_on_all_checkbox_in_addons();
		bulk.User_clicked_on_apply_button_in_addons();
		bulk.User_started_entering_numeric();
		bulk.User_clicked_on_start_date_and_selected_a_paticular_date1();
		bulk.User_clicked_on_end_date_and_selected_a_paticular_date1();
		bulk.User_clicked_on_submit();
		bulk.User_enter_mfa_code_for_subscription_license();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Approved_License() throws Throwable {
		driver.get(urlToTest);
		bulk.Login_Master_Finance();
		bulk.User_clicked_on_bulk_licenses();
		bulk.User_clicked_on_pending_licenses();
		bulk.User_accept_the_license_from_master_finance();
		bulk.User_write_the_reason_why_he_accepted_the_license_from_master_finance();
		bulk.User_enter_the_mfa_code_for_accepting_the_license_from_master_finance();
		bulk.Logout();
		bulk.Login_Master_Admin();
		bulk.User_clicked_on_bulk_licenses();
		bulk.User_clicked_on_pending_licenses();
		bulk.User_accept_the_license_from_master_admin();
		bulk.User_write_the_reason_why_he_accepted_the_license_from_master_admin();
		bulk.User_enter_the_mfa_code_for_accepting_the_license_from_master_admin();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void OnDemand_License() throws InterruptedException, AWTException {
		Logindetails();
		ondemand.user_click_on_ondemand_license();
		ondemand.user_click_on_any_Partner_name();
		ondemand.user_change_the_tabs_in_license();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Approve_OnDemand_License() throws InterruptedException, AWTException {
		driver.get(urlToTest);
		ondemand.Login_Master_Finance();
		ondemand.user_click_on_ondemand_license();
		ondemand.user_click_on_pending_License();
		ondemand.Accept_ondemand_License_By_Master_Finance();
		ondemand.Logout();
		ondemand.Login_Master_Admin();
		ondemand.user_click_on_ondemand_license();
		ondemand.user_click_on_pending_License();
		ondemand.Accept_ondemand_License_By_Master_Admin();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Adding_Partner() throws InterruptedException, AWTException {
		Logindetails();
		partner.user_click_on_Partner_page();
		partner.click_on_add_new_partner_button();
		partner.click_on_partner_name_enter_partner_name();
		partner.click_on_contact_name_enter_contact_name();
		partner.click_on_partner_moniker_enter_partner_moniker();
		partner.click_on_country_code_select_the_country_code();
		partner.click_on_mobile_num_enter_mobile_num();
		partner.click_on_email_id_enter_email_id();
		partner.click_on_address_enter_address();
		partner.click_on_country_click_on_search_enter_country_name();
		partner.click_on_city_click_on_search_enter_city_name();
		partner.click_on_bank_details_enter_bank_details();
		partner.click_on_pan_num_enter_pan_num();
		partner.click_on_gst_num_enter_gst_num();
		partner.click_on_save_button_in_add_new_partner_page();
		// contacts tab
		partner.select_the_role_dropdown_in_contacts_tab();
		partner.click_on_search_enter_any_valid_role_name();
		partner.select_the_role_in_dropdown();
		partner.enter_the_name_in_contacts_tab();
		partner.enter_the_email_id_in_contacts_tab();
		partner.click_on_country_code_select_the_country_code_in_contacts_page();
		partner.enter_the_mobile_num_in_contacts_tab();
		partner.select_the_dropdown_of_country();
		partner.click_on_search_enter_valid_country_name_in_contacts_tab();
		partner.select_the_dropdown_of_city();
		partner.click_on_search_enter_valid_city_name_in_contacts_tab();
		partner.click_on_save_next_button_in_contacts_tab();
		// doc tab
		partner.click_on_upload_button();
		partner.select_the_image_click_on_that_image();
		partner.enter_title_in_doc_page();
		partner.click_on_save_next_button_in_doc_page();
		// plan
		partner.click_on_select_in_Plan_tab();
		partner.click_on_search_search_the_valid_plan();
		partner.select_the_Plan_in_dropdown_list();
		partner.click_on_next_button_in_plan();
		partner.click_on_select_dropdown_in_package();
		partner.click_on_search_enter_Valid_search_in_packages_tab();
		partner.click_on_package_in_dropdown();
		partner.click_on_next_button_in_package();
		partner.select_the_checkbox_in_individual_addons();
		partner.click_on_save_next_button_in_individual_addons();
		// pricing tab
		partner.click_on_select_dropdown_in_pricing_tab();
		partner.click_on_search_enter_valid_search_in_pricing_tab();
		partner.click_on_rupees_dropdown_in_pricing_tab();
		partner.click_on_apply_button_in_pricing_tab();
		partner.enter_the_cost_of_rupees();
		partner.click_on_next_button_for_pricing();
		partner.enter_the_cost_of_rupees();
		partner.click_on_next_button_in_package_tab();
		partner.enter_the_cost_of_rupees_in_individual_addons();
		partner.click_on_next_button_in_individual_addons();
		// stores
		partner.click_on_white_Label_Setup_button_in_stores_for_saas();
		partner.enter_the_brand_title_in_stores_tab();
		partner.click_on_save_button_in_stores();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Edit_Partner() throws InterruptedException, AWTException {
		Logindetails();
		partner.user_click_on_Partner_page();
		partner.click_on_added_partner();
		// Profile
		partner.click_on_save_button_in_add_new_partner_page();
		// contact page
		partner.click_on_save_next_button_in_contacts_tab();
		// doc page
		partner.click_on_save_next_button_in_doc_page();
		// plan page
		partner.click_on_next_button_in_plan();
		partner.click_on_next_button_in_package();
		partner.click_on_save_next_button_in_individual_addons();
		// pricing tab
		partner.click_on_next_button_for_pricing();
		partner.click_on_next_button_in_package_tab();
		partner.click_on_next_button_in_individual_addons();
		// stores
		partner.click_on_white_Label_Setup_button_in_stores_for_saas();
		partner.enter_the_brand_title_in_stores_tab();
		partner.attach_the_attachment_in_first_logo();
		partner.attach_the_attachment_in_icon();
		partner.enter_the_play_store_link_in_stores_tab();
		partner.enter_the_app_store_link_in_stores_tab();
		partner.click_on_save_button_in_stores();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Deactivate_Partner() throws InterruptedException, AWTException {
		Logindetails();
		partner.user_click_on_Partner_page();
		partner.click_on_added_partner();
		partner.click_on_deactivate_button();
		partner.click_on_yes_button_in_popup_page_for_deactivate_company();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Setup() throws InterruptedException, AWTException {
		Logindetails();
		setup.user_click_on_setup_page();
		setup.click_on_add_internal_user_button();
		setup.enter_name();
		setup.enter_email();
		setup.enter_mobile_num();
		setup.click_on_role_select_role();
		setup.click_on_submit_button();
		setup.click_on_edit_button_for_user();
		setup.click_on_submit_button();
		setup.click_on_edit_button_for_user();
		setup.click_on_reset_password_button();
		setup.click_on_reset_button_in_popup_msg();
		setup.click_on_back_button_for_user();
		setup.click_on_delete_button_for_user();
		setup.click_on_yes_button_in_delete_popup();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Notification() throws InterruptedException, AWTException {
		Logindetails();
		notification.user_click_on_Notification_page();
		notification.Click_on_All_radio_button_in_notifications();
		notification.Click_on_any_licenses_in_all_notifications();
		notification.user_click_on_Notification_page();
		notification.Click_on_super_admin_radio_button_in_notifications();
		notification.Click_on_any_licenses_in_super_admin_notifications();
		notification.user_click_on_Notification_page();
		notification.Click_on_Master_admin_radio_button_in_notifications();
		notification.Click_on_any_licenses_in_Master_admin_notifications();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Profile() throws Throwable {
		Logindetails();
		profile.User_click_on_view_profile_button();
		profile.User_click_on_add_profile_button();
		profile.upload_the_image();
		profile.User_clicked_on_change_button();
		profile.change_the_image();
		profile.Delete_Profile();
		profile.User_clicked_on_change_password();
		profile.User_started_entering_current_password();
		profile.User_started_entering_new_password();
		profile.User_started_entering_confirm_password();
		profile.User_clicked_on_submit();
		profile.User_clicked_on_back_button_in_password();
		profile.User_clicked_on_back_button_in_profile_page();
		waitTillPassiveScanCompleted();
	}

	@Test
	public void Logout() throws Throwable {
		Logindetails();
		logout.User_Clicked_on_logout();
		waitTillPassiveScanCompleted();
	}

	@AfterMethod
	public void tearDown(Method method) throws ClientApiException {
		generateZapReport(urlToTest);
		driver.quit();
	}

}