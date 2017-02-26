require 'test_helper'

class WorkOrderCommentsControllerTest < ActionController::TestCase
  setup do
    @work_order_comment = work_order_comments(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_order_comments)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_order_comment" do
    assert_difference('WorkOrderComment.count') do
      post :create, work_order_comment: { comment_id: @work_order_comment.comment_id, work_order_id: @work_order_comment.work_order_id }
    end

    assert_redirected_to work_order_comment_path(assigns(:work_order_comment))
  end

  test "should show work_order_comment" do
    get :show, id: @work_order_comment
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_order_comment
    assert_response :success
  end

  test "should update work_order_comment" do
    patch :update, id: @work_order_comment, work_order_comment: { comment_id: @work_order_comment.comment_id, work_order_id: @work_order_comment.work_order_id }
    assert_redirected_to work_order_comment_path(assigns(:work_order_comment))
  end

  test "should destroy work_order_comment" do
    assert_difference('WorkOrderComment.count', -1) do
      delete :destroy, id: @work_order_comment
    end

    assert_redirected_to work_order_comments_path
  end
end
