require 'test_helper'

class WorkTaskCrewsControllerTest < ActionController::TestCase
  setup do
    @work_task_crew = work_task_crews(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_task_crews)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_task_crew" do
    assert_difference('WorkTaskCrew.count') do
      post :create, work_task_crew: { crew_id: @work_task_crew.crew_id, work_task_id: @work_task_crew.work_task_id }
    end

    assert_redirected_to work_task_crew_path(assigns(:work_task_crew))
  end

  test "should show work_task_crew" do
    get :show, id: @work_task_crew
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_task_crew
    assert_response :success
  end

  test "should update work_task_crew" do
    patch :update, id: @work_task_crew, work_task_crew: { crew_id: @work_task_crew.crew_id, work_task_id: @work_task_crew.work_task_id }
    assert_redirected_to work_task_crew_path(assigns(:work_task_crew))
  end

  test "should destroy work_task_crew" do
    assert_difference('WorkTaskCrew.count', -1) do
      delete :destroy, id: @work_task_crew
    end

    assert_redirected_to work_task_crews_path
  end
end
