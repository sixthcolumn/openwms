require 'test_helper'

class WorkOrderAttachmentsControllerTest < ActionController::TestCase
  setup do
    @work_order_attachment = work_order_attachments(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_order_attachments)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_order_attachment" do
    assert_difference('WorkOrderAttachment.count') do
      post :create, work_order_attachment: { attachment_id: @work_order_attachment.attachment_id, work_order_id: @work_order_attachment.work_order_id }
    end

    assert_redirected_to work_order_attachment_path(assigns(:work_order_attachment))
  end

  test "should show work_order_attachment" do
    get :show, id: @work_order_attachment
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_order_attachment
    assert_response :success
  end

  test "should update work_order_attachment" do
    patch :update, id: @work_order_attachment, work_order_attachment: { attachment_id: @work_order_attachment.attachment_id, work_order_id: @work_order_attachment.work_order_id }
    assert_redirected_to work_order_attachment_path(assigns(:work_order_attachment))
  end

  test "should destroy work_order_attachment" do
    assert_difference('WorkOrderAttachment.count', -1) do
      delete :destroy, id: @work_order_attachment
    end

    assert_redirected_to work_order_attachments_path
  end
end
