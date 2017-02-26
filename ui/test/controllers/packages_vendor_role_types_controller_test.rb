require 'test_helper'

class PackagesVendorRoleTypesControllerTest < ActionController::TestCase
  setup do
    @packages_vendor_role_type = packages_vendor_role_types(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:packages_vendor_role_types)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create packages_vendor_role_type" do
    assert_difference('PackagesVendorRoleType.count') do
      post :create, packages_vendor_role_type: { package_id: @packages_vendor_role_type.package_id, vendor_role_type_id: @packages_vendor_role_type.vendor_role_type_id }
    end

    assert_redirected_to packages_vendor_role_type_path(assigns(:packages_vendor_role_type))
  end

  test "should show packages_vendor_role_type" do
    get :show, id: @packages_vendor_role_type
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @packages_vendor_role_type
    assert_response :success
  end

  test "should update packages_vendor_role_type" do
    patch :update, id: @packages_vendor_role_type, packages_vendor_role_type: { package_id: @packages_vendor_role_type.package_id, vendor_role_type_id: @packages_vendor_role_type.vendor_role_type_id }
    assert_redirected_to packages_vendor_role_type_path(assigns(:packages_vendor_role_type))
  end

  test "should destroy packages_vendor_role_type" do
    assert_difference('PackagesVendorRoleType.count', -1) do
      delete :destroy, id: @packages_vendor_role_type
    end

    assert_redirected_to packages_vendor_role_types_path
  end
end
