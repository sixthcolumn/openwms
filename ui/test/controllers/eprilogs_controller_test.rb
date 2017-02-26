require 'test_helper'

class EprilogsControllerTest < ActionController::TestCase
  setup do
    @eprilog = eprilogs(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:eprilogs)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create eprilog" do
    assert_difference('Eprilog.count') do
      post :create, eprilog: { INTERFACE_ID: @eprilog.INTERFACE_ID, address: @eprilog.address, contentType: @eprilog.contentType, create_date: @eprilog.create_date, data: @eprilog.data, encoding: @eprilog.encoding, faultCode: @eprilog.faultCode, header: @eprilog.header, httpMethod: @eprilog.httpMethod, message: @eprilog.message, messageId: @eprilog.messageId, operation: @eprilog.operation, payload: @eprilog.payload, responseCode: @eprilog.responseCode, resultCode: @eprilog.resultCode, stage: @eprilog.stage }
    end

    assert_redirected_to eprilog_path(assigns(:eprilog))
  end

  test "should show eprilog" do
    get :show, id: @eprilog
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @eprilog
    assert_response :success
  end

  test "should update eprilog" do
    patch :update, id: @eprilog, eprilog: { INTERFACE_ID: @eprilog.INTERFACE_ID, address: @eprilog.address, contentType: @eprilog.contentType, create_date: @eprilog.create_date, data: @eprilog.data, encoding: @eprilog.encoding, faultCode: @eprilog.faultCode, header: @eprilog.header, httpMethod: @eprilog.httpMethod, message: @eprilog.message, messageId: @eprilog.messageId, operation: @eprilog.operation, payload: @eprilog.payload, responseCode: @eprilog.responseCode, resultCode: @eprilog.resultCode, stage: @eprilog.stage }
    assert_redirected_to eprilog_path(assigns(:eprilog))
  end

  test "should destroy eprilog" do
    assert_difference('Eprilog.count', -1) do
      delete :destroy, id: @eprilog
    end

    assert_redirected_to eprilogs_path
  end
end
