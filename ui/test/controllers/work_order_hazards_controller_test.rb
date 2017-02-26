require 'test_helper'

class WorkOrderHazardsControllerTest < ActionController::TestCase
  setup do
    @work_order_hazard = work_order_hazards(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_order_hazards)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_order_hazard" do
    assert_difference('WorkOrderHazard.count') do
      post :create, work_order_hazard: { hazard_id: @work_order_hazard.hazard_id, work_order_id: @work_order_hazard.work_order_id }
    end

    assert_redirected_to work_order_hazard_path(assigns(:work_order_hazard))
  end

  test "should show work_order_hazard" do
    get :show, id: @work_order_hazard
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_order_hazard
    assert_response :success
  end

  test "should update work_order_hazard" do
    patch :update, id: @work_order_hazard, work_order_hazard: { hazard_id: @work_order_hazard.hazard_id, work_order_id: @work_order_hazard.work_order_id }
    assert_redirected_to work_order_hazard_path(assigns(:work_order_hazard))
  end

  test "should destroy work_order_hazard" do
    assert_difference('WorkOrderHazard.count', -1) do
      delete :destroy, id: @work_order_hazard
    end

    assert_redirected_to work_order_hazards_path
  end
end
