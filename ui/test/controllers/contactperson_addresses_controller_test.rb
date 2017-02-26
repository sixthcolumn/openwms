require 'test_helper'

class ContactpersonAddressesControllerTest < ActionController::TestCase
  setup do
    @contactperson_address = contactperson_addresses(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:contactperson_addresses)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create contactperson_address" do
    assert_difference('ContactpersonAddress.count') do
      post :create, contactperson_address: { address_id: @contactperson_address.address_id, address_type: @contactperson_address.address_type, contactperson_id: @contactperson_address.contactperson_id, priority_order: @contactperson_address.priority_order }
    end

    assert_redirected_to contactperson_address_path(assigns(:contactperson_address))
  end

  test "should show contactperson_address" do
    get :show, id: @contactperson_address
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @contactperson_address
    assert_response :success
  end

  test "should update contactperson_address" do
    patch :update, id: @contactperson_address, contactperson_address: { address_id: @contactperson_address.address_id, address_type: @contactperson_address.address_type, contactperson_id: @contactperson_address.contactperson_id, priority_order: @contactperson_address.priority_order }
    assert_redirected_to contactperson_address_path(assigns(:contactperson_address))
  end

  test "should destroy contactperson_address" do
    assert_difference('ContactpersonAddress.count', -1) do
      delete :destroy, id: @contactperson_address
    end

    assert_redirected_to contactperson_addresses_path
  end
end
