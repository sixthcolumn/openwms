require 'test_helper'

class CrewNamesControllerTest < ActionController::TestCase
  setup do
    @crew_name = crew_names(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:crew_names)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create crew_name" do
    assert_difference('CrewName.count') do
      post :create, crew_name: { crew_id: @crew_name.crew_id, name: @crew_name.name, name_type_id: @crew_name.name_type_id }
    end

    assert_redirected_to crew_name_path(assigns(:crew_name))
  end

  test "should show crew_name" do
    get :show, id: @crew_name
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @crew_name
    assert_response :success
  end

  test "should update crew_name" do
    patch :update, id: @crew_name, crew_name: { crew_id: @crew_name.crew_id, name: @crew_name.name, name_type_id: @crew_name.name_type_id }
    assert_redirected_to crew_name_path(assigns(:crew_name))
  end

  test "should destroy crew_name" do
    assert_difference('CrewName.count', -1) do
      delete :destroy, id: @crew_name
    end

    assert_redirected_to crew_names_path
  end
end
