require 'test_helper'

class WorkOrderWorkTasksControllerTest < ActionController::TestCase
  setup do
    @work_order_work_task = work_order_work_tasks(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_order_work_tasks)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_order_work_task" do
    assert_difference('WorkOrderWorkTask.count') do
      post :create, work_order_work_task: { work_order_id: @work_order_work_task.work_order_id, work_task_id: @work_order_work_task.work_task_id }
    end

    assert_redirected_to work_order_work_task_path(assigns(:work_order_work_task))
  end

  test "should show work_order_work_task" do
    get :show, id: @work_order_work_task
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_order_work_task
    assert_response :success
  end

  test "should update work_order_work_task" do
    patch :update, id: @work_order_work_task, work_order_work_task: { work_order_id: @work_order_work_task.work_order_id, work_task_id: @work_order_work_task.work_task_id }
    assert_redirected_to work_order_work_task_path(assigns(:work_order_work_task))
  end

  test "should destroy work_order_work_task" do
    assert_difference('WorkOrderWorkTask.count', -1) do
      delete :destroy, id: @work_order_work_task
    end

    assert_redirected_to work_order_work_tasks_path
  end
end
