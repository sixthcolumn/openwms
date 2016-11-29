require 'test_helper'

class AddressPositionPointsControllerTest < ActionController::TestCase
  setup do
    @address_position_point = address_position_points(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:address_position_points)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create address_position_point" do
    assert_difference('AddressPositionPoint.count') do
      post :create, address_position_point: { address_id: @address_position_point.address_id, sequence: @address_position_point.sequence, xposition: @address_position_point.xposition, yposition: @address_position_point.yposition, zposition: @address_position_point.zposition }
    end

    assert_redirected_to address_position_point_path(assigns(:address_position_point))
  end

  test "should show address_position_point" do
    get :show, id: @address_position_point
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @address_position_point
    assert_response :success
  end

  test "should update address_position_point" do
    patch :update, id: @address_position_point, address_position_point: { address_id: @address_position_point.address_id, sequence: @address_position_point.sequence, xposition: @address_position_point.xposition, yposition: @address_position_point.yposition, zposition: @address_position_point.zposition }
    assert_redirected_to address_position_point_path(assigns(:address_position_point))
  end

  test "should destroy address_position_point" do
    assert_difference('AddressPositionPoint.count', -1) do
      delete :destroy, id: @address_position_point
    end

    assert_redirected_to address_position_points_path
  end
end
