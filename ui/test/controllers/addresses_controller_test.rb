require 'test_helper'

class AddressesControllerTest < ActionController::TestCase
  setup do
    @address = addresses(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:addresses)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create address" do
    assert_difference('Address.count') do
      post :create, address: { block: @address.block, coord_system: @address.coord_system, county: @address.county, directions: @address.directions, lot: @address.lot, sd_address_1: @address.sd_address_1, sd_address_2: @address.sd_address_2, sd_building_name: @address.sd_building_name, sd_code: @address.sd_code, sd_number: @address.sd_number, sd_prefix: @address.sd_prefix, sd_suffix: @address.sd_suffix, sd_suite_number: @address.sd_suite_number, sd_type: @address.sd_type, sd_within_town_limits_flag: @address.sd_within_town_limits_flag, subdivision: @address.subdivision, td_code: @address.td_code, td_country: @address.td_country, td_name: @address.td_name, td_pobox: @address.td_pobox, td_postal_code: @address.td_postal_code, td_region: @address.td_region, td_section: @address.td_section, td_state_province: @address.td_state_province, time_zone: @address.time_zone, township_name: @address.township_name }
    end

    assert_redirected_to address_path(assigns(:address))
  end

  test "should show address" do
    get :show, id: @address
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @address
    assert_response :success
  end

  test "should update address" do
    patch :update, id: @address, address: { block: @address.block, coord_system: @address.coord_system, county: @address.county, directions: @address.directions, lot: @address.lot, sd_address_1: @address.sd_address_1, sd_address_2: @address.sd_address_2, sd_building_name: @address.sd_building_name, sd_code: @address.sd_code, sd_number: @address.sd_number, sd_prefix: @address.sd_prefix, sd_suffix: @address.sd_suffix, sd_suite_number: @address.sd_suite_number, sd_type: @address.sd_type, sd_within_town_limits_flag: @address.sd_within_town_limits_flag, subdivision: @address.subdivision, td_code: @address.td_code, td_country: @address.td_country, td_name: @address.td_name, td_pobox: @address.td_pobox, td_postal_code: @address.td_postal_code, td_region: @address.td_region, td_section: @address.td_section, td_state_province: @address.td_state_province, time_zone: @address.time_zone, township_name: @address.township_name }
    assert_redirected_to address_path(assigns(:address))
  end

  test "should destroy address" do
    assert_difference('Address.count', -1) do
      delete :destroy, id: @address
    end

    assert_redirected_to addresses_path
  end
end
