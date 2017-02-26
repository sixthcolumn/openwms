require 'test_helper'

class WorkOrderLocationObjectRefsControllerTest < ActionController::TestCase
  setup do
    @work_order_location_object_ref = work_order_location_object_refs(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_order_location_object_refs)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_order_location_object_ref" do
    assert_difference('WorkOrderLocationObjectRef.count') do
      post :create, work_order_location_object_ref: { loc_ref_object_id: @work_order_location_object_ref.loc_ref_object_id, work_order_id: @work_order_location_object_ref.work_order_id }
    end

    assert_redirected_to work_order_location_object_ref_path(assigns(:work_order_location_object_ref))
  end

  test "should show work_order_location_object_ref" do
    get :show, id: @work_order_location_object_ref
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_order_location_object_ref
    assert_response :success
  end

  test "should update work_order_location_object_ref" do
    patch :update, id: @work_order_location_object_ref, work_order_location_object_ref: { loc_ref_object_id: @work_order_location_object_ref.loc_ref_object_id, work_order_id: @work_order_location_object_ref.work_order_id }
    assert_redirected_to work_order_location_object_ref_path(assigns(:work_order_location_object_ref))
  end

  test "should destroy work_order_location_object_ref" do
    assert_difference('WorkOrderLocationObjectRef.count', -1) do
      delete :destroy, id: @work_order_location_object_ref
    end

    assert_redirected_to work_order_location_object_refs_path
  end
end
