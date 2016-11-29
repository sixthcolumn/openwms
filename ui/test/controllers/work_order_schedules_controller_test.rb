require 'test_helper'

class WorkOrderSchedulesControllerTest < ActionController::TestCase
  setup do
    @work_order_schedule = work_order_schedules(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_order_schedules)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_order_schedule" do
    assert_difference('WorkOrderSchedule.count') do
      post :create, work_order_schedule: { time_schedule_id: @work_order_schedule.time_schedule_id, work_order_id: @work_order_schedule.work_order_id }
    end

    assert_redirected_to work_order_schedule_path(assigns(:work_order_schedule))
  end

  test "should show work_order_schedule" do
    get :show, id: @work_order_schedule
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_order_schedule
    assert_response :success
  end

  test "should update work_order_schedule" do
    patch :update, id: @work_order_schedule, work_order_schedule: { time_schedule_id: @work_order_schedule.time_schedule_id, work_order_id: @work_order_schedule.work_order_id }
    assert_redirected_to work_order_schedule_path(assigns(:work_order_schedule))
  end

  test "should destroy work_order_schedule" do
    assert_difference('WorkOrderSchedule.count', -1) do
      delete :destroy, id: @work_order_schedule
    end

    assert_redirected_to work_order_schedules_path
  end
end
