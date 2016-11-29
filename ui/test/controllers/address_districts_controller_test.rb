require 'test_helper'

class AddressDistrictsControllerTest < ActionController::TestCase
  setup do
    @address_district = address_districts(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:address_districts)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create address_district" do
    assert_difference('AddressDistrict.count') do
      post :create, address_district: { address_id: @address_district.address_id, district_id: @address_district.district_id }
    end

    assert_redirected_to address_district_path(assigns(:address_district))
  end

  test "should show address_district" do
    get :show, id: @address_district
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @address_district
    assert_response :success
  end

  test "should update address_district" do
    patch :update, id: @address_district, address_district: { address_id: @address_district.address_id, district_id: @address_district.district_id }
    assert_redirected_to address_district_path(assigns(:address_district))
  end

  test "should destroy address_district" do
    assert_difference('AddressDistrict.count', -1) do
      delete :destroy, id: @address_district
    end

    assert_redirected_to address_districts_path
  end
end
