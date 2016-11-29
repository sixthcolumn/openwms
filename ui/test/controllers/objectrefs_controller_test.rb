require 'test_helper'

class ObjectrefsControllerTest < ActionController::TestCase
  setup do
    @objectref = objectrefs(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:objectrefs)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create objectref" do
    assert_difference('Objectref.count') do
      post :create, objectref: { noun: @objectref.noun, object_guid: @objectref.object_guid, primary_name: @objectref.primary_name, registered_name: @objectref.registered_name, secondary_name: @objectref.secondary_name, system_name: @objectref.system_name, utility: @objectref.utility }
    end

    assert_redirected_to objectref_path(assigns(:objectref))
  end

  test "should show objectref" do
    get :show, id: @objectref
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @objectref
    assert_response :success
  end

  test "should update objectref" do
    patch :update, id: @objectref, objectref: { noun: @objectref.noun, object_guid: @objectref.object_guid, primary_name: @objectref.primary_name, registered_name: @objectref.registered_name, secondary_name: @objectref.secondary_name, system_name: @objectref.system_name, utility: @objectref.utility }
    assert_redirected_to objectref_path(assigns(:objectref))
  end

  test "should destroy objectref" do
    assert_difference('Objectref.count', -1) do
      delete :destroy, id: @objectref
    end

    assert_redirected_to objectrefs_path
  end
end
