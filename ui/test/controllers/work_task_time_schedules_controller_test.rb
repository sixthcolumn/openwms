require 'test_helper'

class WorkTaskTimeSchedulesControllerTest < ActionController::TestCase
  setup do
    @work_task_time_schedule = work_task_time_schedules(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_task_time_schedules)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_task_time_schedule" do
    assert_difference('WorkTaskTimeSchedule.count') do
      post :create, work_task_time_schedule: { time_schedule_id: @work_task_time_schedule.time_schedule_id, work_task_id: @work_task_time_schedule.work_task_id }
    end

    assert_redirected_to work_task_time_schedule_path(assigns(:work_task_time_schedule))
  end

  test "should show work_task_time_schedule" do
    get :show, id: @work_task_time_schedule
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_task_time_schedule
    assert_response :success
  end

  test "should update work_task_time_schedule" do
    patch :update, id: @work_task_time_schedule, work_task_time_schedule: { time_schedule_id: @work_task_time_schedule.time_schedule_id, work_task_id: @work_task_time_schedule.work_task_id }
    assert_redirected_to work_task_time_schedule_path(assigns(:work_task_time_schedule))
  end

  test "should destroy work_task_time_schedule" do
    assert_difference('WorkTaskTimeSchedule.count', -1) do
      delete :destroy, id: @work_task_time_schedule
    end

    assert_redirected_to work_task_time_schedules_path
  end
end
