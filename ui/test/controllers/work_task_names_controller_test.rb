require 'test_helper'

class WorkTaskNamesControllerTest < ActionController::TestCase
  setup do
    @work_task_name = work_task_names(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_task_names)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_task_name" do
    assert_difference('WorkTaskName.count') do
      post :create, work_task_name: { name: @work_task_name.name, name_type_id: @work_task_name.name_type_id, work_task_id: @work_task_name.work_task_id }
    end

    assert_redirected_to work_task_name_path(assigns(:work_task_name))
  end

  test "should show work_task_name" do
    get :show, id: @work_task_name
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_task_name
    assert_response :success
  end

  test "should update work_task_name" do
    patch :update, id: @work_task_name, work_task_name: { name: @work_task_name.name, name_type_id: @work_task_name.name_type_id, work_task_id: @work_task_name.work_task_id }
    assert_redirected_to work_task_name_path(assigns(:work_task_name))
  end

  test "should destroy work_task_name" do
    assert_difference('WorkTaskName.count', -1) do
      delete :destroy, id: @work_task_name
    end

    assert_redirected_to work_task_names_path
  end
end
