require 'test_helper'

class WorkTasksControllerTest < ActionController::TestCase
  setup do
    @work_task = work_tasks(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_tasks)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_task" do
    assert_difference('WorkTask.count') do
      post :create, work_task: { crew_eta: @work_task.crew_eta, instructions: @work_task.instructions, mRID: @work_task.mRID, old_asset_id: @work_task.old_asset_id, subject: @work_task.subject, task_type: @work_task.task_type }
    end

    assert_redirected_to work_task_path(assigns(:work_task))
  end

  test "should show work_task" do
    get :show, id: @work_task
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_task
    assert_response :success
  end

  test "should update work_task" do
    patch :update, id: @work_task, work_task: { crew_eta: @work_task.crew_eta, instructions: @work_task.instructions, mRID: @work_task.mRID, old_asset_id: @work_task.old_asset_id, subject: @work_task.subject, task_type: @work_task.task_type }
    assert_redirected_to work_task_path(assigns(:work_task))
  end

  test "should destroy work_task" do
    assert_difference('WorkTask.count', -1) do
      delete :destroy, id: @work_task
    end

    assert_redirected_to work_tasks_path
  end
end
