require 'test_helper'

class ProxyInterfacesControllerTest < ActionController::TestCase
  setup do
    @proxy_interface = proxy_interfaces(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:proxy_interfaces)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create proxy_interface" do
    assert_difference('ProxyInterface.count') do
      post :create, proxy_interface: { interface_id: @proxy_interface.interface_id, proxy_url: @proxy_interface.proxy_url }
    end

    assert_redirected_to proxy_interface_path(assigns(:proxy_interface))
  end

  test "should show proxy_interface" do
    get :show, id: @proxy_interface
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @proxy_interface
    assert_response :success
  end

  test "should update proxy_interface" do
    patch :update, id: @proxy_interface, proxy_interface: { interface_id: @proxy_interface.interface_id, proxy_url: @proxy_interface.proxy_url }
    assert_redirected_to proxy_interface_path(assigns(:proxy_interface))
  end

  test "should destroy proxy_interface" do
    assert_difference('ProxyInterface.count', -1) do
      delete :destroy, id: @proxy_interface
    end

    assert_redirected_to proxy_interfaces_path
  end
end
