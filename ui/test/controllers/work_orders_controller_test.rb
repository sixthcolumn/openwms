require 'test_helper'

class WorkOrdersControllerTest < ActionController::TestCase
  setup do
    @work_order = work_orders(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_orders)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_order" do
    assert_difference('WorkOrder.count') do
      post :create, work_order: { address_id: @work_order.address_id, comments: @work_order.comments, created_by: @work_order.created_by, description: @work_order.description, gps_altitude: @work_order.gps_altitude, gps_latitude: @work_order.gps_latitude, gps_longitude: @work_order.gps_longitude, grid_location: @work_order.grid_location, internal_building_name: @work_order.internal_building_name, internal_building_num: @work_order.internal_building_num, internal_floor: @work_order.internal_floor, internal_room_num: @work_order.internal_room_num, kind: @work_order.kind, location_comment: @work_order.location_comment, location_contact_id: @work_order.location_contact_id, mRid: @work_order.mRid, primary_object_ref_id: @work_order.primary_object_ref_id, priority_justification: @work_order.priority_justification, priority_rank: @work_order.priority_rank, priority_type: @work_order.priority_type, request_contact_id: @work_order.request_contact_id, request_datetime: @work_order.request_datetime, status: @work_order.status, status_kind: @work_order.status_kind, title: @work_order.title, updated_by: @work_order.updated_by, work_order_name: @work_order.work_order_name }
    end

    assert_redirected_to work_order_path(assigns(:work_order))
  end

  test "should show work_order" do
    get :show, id: @work_order
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_order
    assert_response :success
  end

  test "should update work_order" do
    patch :update, id: @work_order, work_order: { address_id: @work_order.address_id, comments: @work_order.comments, created_by: @work_order.created_by, description: @work_order.description, gps_altitude: @work_order.gps_altitude, gps_latitude: @work_order.gps_latitude, gps_longitude: @work_order.gps_longitude, grid_location: @work_order.grid_location, internal_building_name: @work_order.internal_building_name, internal_building_num: @work_order.internal_building_num, internal_floor: @work_order.internal_floor, internal_room_num: @work_order.internal_room_num, kind: @work_order.kind, location_comment: @work_order.location_comment, location_contact_id: @work_order.location_contact_id, mRid: @work_order.mRid, primary_object_ref_id: @work_order.primary_object_ref_id, priority_justification: @work_order.priority_justification, priority_rank: @work_order.priority_rank, priority_type: @work_order.priority_type, request_contact_id: @work_order.request_contact_id, request_datetime: @work_order.request_datetime, status: @work_order.status, status_kind: @work_order.status_kind, title: @work_order.title, updated_by: @work_order.updated_by, work_order_name: @work_order.work_order_name }
    assert_redirected_to work_order_path(assigns(:work_order))
  end

  test "should destroy work_order" do
    assert_difference('WorkOrder.count', -1) do
      delete :destroy, id: @work_order
    end

    assert_redirected_to work_orders_path
  end
end
