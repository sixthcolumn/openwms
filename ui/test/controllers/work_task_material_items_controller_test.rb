require 'test_helper'

class WorkTaskMaterialItemsControllerTest < ActionController::TestCase
  setup do
    @work_task_material_item = work_task_material_items(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_task_material_items)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_task_material_item" do
    assert_difference('WorkTaskMaterialItem.count') do
      post :create, work_task_material_item: { material_item_id: @work_task_material_item.material_item_id, work_task_id: @work_task_material_item.work_task_id }
    end

    assert_redirected_to work_task_material_item_path(assigns(:work_task_material_item))
  end

  test "should show work_task_material_item" do
    get :show, id: @work_task_material_item
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_task_material_item
    assert_response :success
  end

  test "should update work_task_material_item" do
    patch :update, id: @work_task_material_item, work_task_material_item: { material_item_id: @work_task_material_item.material_item_id, work_task_id: @work_task_material_item.work_task_id }
    assert_redirected_to work_task_material_item_path(assigns(:work_task_material_item))
  end

  test "should destroy work_task_material_item" do
    assert_difference('WorkTaskMaterialItem.count', -1) do
      delete :destroy, id: @work_task_material_item
    end

    assert_redirected_to work_task_material_items_path
  end
end
