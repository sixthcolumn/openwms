require 'test_helper'

class AddressHazardsControllerTest < ActionController::TestCase
  setup do
    @address_hazard = address_hazards(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:address_hazards)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create address_hazard" do
    assert_difference('AddressHazard.count') do
      post :create, address_hazard: { address_id: @address_hazard.address_id, hazard_id: @address_hazard.hazard_id }
    end

    assert_redirected_to address_hazard_path(assigns(:address_hazard))
  end

  test "should show address_hazard" do
    get :show, id: @address_hazard
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @address_hazard
    assert_response :success
  end

  test "should update address_hazard" do
    patch :update, id: @address_hazard, address_hazard: { address_id: @address_hazard.address_id, hazard_id: @address_hazard.hazard_id }
    assert_redirected_to address_hazard_path(assigns(:address_hazard))
  end

  test "should destroy address_hazard" do
    assert_difference('AddressHazard.count', -1) do
      delete :destroy, id: @address_hazard
    end

    assert_redirected_to address_hazards_path
  end
end
