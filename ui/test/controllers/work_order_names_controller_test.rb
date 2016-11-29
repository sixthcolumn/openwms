require 'test_helper'

class WorkOrderNamesControllerTest < ActionController::TestCase
  setup do
    @work_order_name = work_order_names(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_order_names)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_order_name" do
    assert_difference('WorkOrderName.count') do
      post :create, work_order_name: { name: @work_order_name.name, name_type_id: @work_order_name.name_type_id, work_order_id: @work_order_name.work_order_id }
    end

    assert_redirected_to work_order_name_path(assigns(:work_order_name))
  end

  test "should show work_order_name" do
    get :show, id: @work_order_name
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_order_name
    assert_response :success
  end

  test "should update work_order_name" do
    patch :update, id: @work_order_name, work_order_name: { name: @work_order_name.name, name_type_id: @work_order_name.name_type_id, work_order_id: @work_order_name.work_order_id }
    assert_redirected_to work_order_name_path(assigns(:work_order_name))
  end

  test "should destroy work_order_name" do
    assert_difference('WorkOrderName.count', -1) do
      delete :destroy, id: @work_order_name
    end

    assert_redirected_to work_order_names_path
  end
end
