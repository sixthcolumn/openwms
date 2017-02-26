require 'test_helper'

class VendorRoleTypesControllerTest < ActionController::TestCase
  setup do
    @vendor_role_type = vendor_role_types(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:vendor_role_types)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create vendor_role_type" do
    assert_difference('VendorRoleType.count') do
      post :create, vendor_role_type: { active_flag: @vendor_role_type.active_flag, name: @vendor_role_type.name }
    end

    assert_redirected_to vendor_role_type_path(assigns(:vendor_role_type))
  end

  test "should show vendor_role_type" do
    get :show, id: @vendor_role_type
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @vendor_role_type
    assert_response :success
  end

  test "should update vendor_role_type" do
    patch :update, id: @vendor_role_type, vendor_role_type: { active_flag: @vendor_role_type.active_flag, name: @vendor_role_type.name }
    assert_redirected_to vendor_role_type_path(assigns(:vendor_role_type))
  end

  test "should destroy vendor_role_type" do
    assert_difference('VendorRoleType.count', -1) do
      delete :destroy, id: @vendor_role_type
    end

    assert_redirected_to vendor_role_types_path
  end
end
