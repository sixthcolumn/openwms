require 'test_helper'

class ContactpeopleControllerTest < ActionController::TestCase
  setup do
    @contactperson = contactpeople(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:contactpeople)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create contactperson" do
    assert_difference('Contactperson.count') do
      post :create, contactperson: { affiliation: @contactperson.affiliation, firstname: @contactperson.firstname, governmentid: @contactperson.governmentid, lastname: @contactperson.lastname, middle: @contactperson.middle, objectid: @contactperson.objectid, prefix: @contactperson.prefix, primary_id: @contactperson.primary_id, secondary_id: @contactperson.secondary_id, suffix: @contactperson.suffix }
    end

    assert_redirected_to contactperson_path(assigns(:contactperson))
  end

  test "should show contactperson" do
    get :show, id: @contactperson
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @contactperson
    assert_response :success
  end

  test "should update contactperson" do
    patch :update, id: @contactperson, contactperson: { affiliation: @contactperson.affiliation, firstname: @contactperson.firstname, governmentid: @contactperson.governmentid, lastname: @contactperson.lastname, middle: @contactperson.middle, objectid: @contactperson.objectid, prefix: @contactperson.prefix, primary_id: @contactperson.primary_id, secondary_id: @contactperson.secondary_id, suffix: @contactperson.suffix }
    assert_redirected_to contactperson_path(assigns(:contactperson))
  end

  test "should destroy contactperson" do
    assert_difference('Contactperson.count', -1) do
      delete :destroy, id: @contactperson
    end

    assert_redirected_to contactpeople_path
  end
end
