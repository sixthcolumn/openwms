require 'test_helper'

class ContactpersonPhonesControllerTest < ActionController::TestCase
  setup do
    @contactperson_phone = contactperson_phones(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:contactperson_phones)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create contactperson_phone" do
    assert_difference('ContactpersonPhone.count') do
      post :create, contactperson_phone: { contactperson_id: @contactperson_phone.contactperson_id, phone_id: @contactperson_phone.phone_id }
    end

    assert_redirected_to contactperson_phone_path(assigns(:contactperson_phone))
  end

  test "should show contactperson_phone" do
    get :show, id: @contactperson_phone
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @contactperson_phone
    assert_response :success
  end

  test "should update contactperson_phone" do
    patch :update, id: @contactperson_phone, contactperson_phone: { contactperson_id: @contactperson_phone.contactperson_id, phone_id: @contactperson_phone.phone_id }
    assert_redirected_to contactperson_phone_path(assigns(:contactperson_phone))
  end

  test "should destroy contactperson_phone" do
    assert_difference('ContactpersonPhone.count', -1) do
      delete :destroy, id: @contactperson_phone
    end

    assert_redirected_to contactperson_phones_path
  end
end
