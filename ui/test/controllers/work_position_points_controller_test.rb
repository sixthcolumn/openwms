require 'test_helper'

class WorkPositionPointsControllerTest < ActionController::TestCase
  setup do
    @work_position_point = work_position_points(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_position_points)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_position_point" do
    assert_difference('WorkPositionPoint.count') do
      post :create, work_position_point: { sequence_num: @work_position_point.sequence_num, work_order_id: @work_position_point.work_order_id, xposition: @work_position_point.xposition, yposition: @work_position_point.yposition, zposition: @work_position_point.zposition }
    end

    assert_redirected_to work_position_point_path(assigns(:work_position_point))
  end

  test "should show work_position_point" do
    get :show, id: @work_position_point
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_position_point
    assert_response :success
  end

  test "should update work_position_point" do
    patch :update, id: @work_position_point, work_position_point: { sequence_num: @work_position_point.sequence_num, work_order_id: @work_position_point.work_order_id, xposition: @work_position_point.xposition, yposition: @work_position_point.yposition, zposition: @work_position_point.zposition }
    assert_redirected_to work_position_point_path(assigns(:work_position_point))
  end

  test "should destroy work_position_point" do
    assert_difference('WorkPositionPoint.count', -1) do
      delete :destroy, id: @work_position_point
    end

    assert_redirected_to work_position_points_path
  end
end
