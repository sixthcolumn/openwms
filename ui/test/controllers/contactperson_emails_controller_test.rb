require 'test_helper'

class ContactpersonEmailsControllerTest < ActionController::TestCase
  setup do
    @contactperson_email = contactperson_emails(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:contactperson_emails)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create contactperson_email" do
    assert_difference('ContactpersonEmail.count') do
      post :create, contactperson_email: { contactperson_id: @contactperson_email.contactperson_id, email_id: @contactperson_email.email_id }
    end

    assert_redirected_to contactperson_email_path(assigns(:contactperson_email))
  end

  test "should show contactperson_email" do
    get :show, id: @contactperson_email
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @contactperson_email
    assert_response :success
  end

  test "should update contactperson_email" do
    patch :update, id: @contactperson_email, contactperson_email: { contactperson_id: @contactperson_email.contactperson_id, email_id: @contactperson_email.email_id }
    assert_redirected_to contactperson_email_path(assigns(:contactperson_email))
  end

  test "should destroy contactperson_email" do
    assert_difference('ContactpersonEmail.count', -1) do
      delete :destroy, id: @contactperson_email
    end

    assert_redirected_to contactperson_emails_path
  end
end
