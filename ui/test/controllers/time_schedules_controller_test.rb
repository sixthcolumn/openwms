require 'test_helper'

class TimeSchedulesControllerTest < ActionController::TestCase
  setup do
    @time_schedule = time_schedules(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:time_schedules)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create time_schedule" do
    assert_difference('TimeSchedule.count') do
      post :create, time_schedule: { end_tstamp: @time_schedule.end_tstamp, start_tstamp: @time_schedule.start_tstamp, type: @time_schedule.type }
    end

    assert_redirected_to time_schedule_path(assigns(:time_schedule))
  end

  test "should show time_schedule" do
    get :show, id: @time_schedule
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @time_schedule
    assert_response :success
  end

  test "should update time_schedule" do
    patch :update, id: @time_schedule, time_schedule: { end_tstamp: @time_schedule.end_tstamp, start_tstamp: @time_schedule.start_tstamp, type: @time_schedule.type }
    assert_redirected_to time_schedule_path(assigns(:time_schedule))
  end

  test "should destroy time_schedule" do
    assert_difference('TimeSchedule.count', -1) do
      delete :destroy, id: @time_schedule
    end

    assert_redirected_to time_schedules_path
  end
end
