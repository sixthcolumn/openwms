require 'test_helper'

class SeqsControllerTest < ActionController::TestCase
  setup do
    @seq = seqs(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:seqs)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create seq" do
    assert_difference('Seq.count') do
      post :create, seq: { curval: @seq.curval, flag: @seq.flag, increment: @seq.increment, seq_name: @seq.seq_name, start: @seq.start }
    end

    assert_redirected_to seq_path(assigns(:seq))
  end

  test "should show seq" do
    get :show, id: @seq
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @seq
    assert_response :success
  end

  test "should update seq" do
    patch :update, id: @seq, seq: { curval: @seq.curval, flag: @seq.flag, increment: @seq.increment, seq_name: @seq.seq_name, start: @seq.start }
    assert_redirected_to seq_path(assigns(:seq))
  end

  test "should destroy seq" do
    assert_difference('Seq.count', -1) do
      delete :destroy, id: @seq
    end

    assert_redirected_to seqs_path
  end
end
