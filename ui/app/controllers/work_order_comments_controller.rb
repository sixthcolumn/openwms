class WorkOrderCommentsController < ApplicationController
  before_action :set_work_order_comment, only: [:show, :edit, :update, :destroy]

  # GET /work_order_comments
  # GET /work_order_comments.json
  def index
    @work_order_comments = WorkOrderComment.all
  end

  # GET /work_order_comments/1
  # GET /work_order_comments/1.json
  def show
  end

  # GET /work_order_comments/new
  def new
    @work_order_comment = WorkOrderComment.new
  end

  # GET /work_order_comments/1/edit
  def edit
  end

  # POST /work_order_comments
  # POST /work_order_comments.json
  def create
    @work_order_comment = WorkOrderComment.new(work_order_comment_params)

    respond_to do |format|
      if @work_order_comment.save
        format.html { redirect_to @work_order_comment, notice: 'Work order comment was successfully created.' }
        format.json { render :show, status: :created, location: @work_order_comment }
      else
        format.html { render :new }
        format.json { render json: @work_order_comment.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_order_comments/1
  # PATCH/PUT /work_order_comments/1.json
  def update
    respond_to do |format|
      if @work_order_comment.update(work_order_comment_params)
        format.html { redirect_to @work_order_comment, notice: 'Work order comment was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_order_comment }
      else
        format.html { render :edit }
        format.json { render json: @work_order_comment.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_order_comments/1
  # DELETE /work_order_comments/1.json
  def destroy
    @work_order_comment.destroy
    respond_to do |format|
      format.html { redirect_to work_order_comments_url, notice: 'Work order comment was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_order_comment
      @work_order_comment = WorkOrderComment.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_order_comment_params
      params.require(:work_order_comment).permit(:work_order_id, :comment_id)
    end
end
