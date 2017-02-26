class WorkOrderAttachmentsController < ApplicationController
  before_action :set_work_order_attachment, only: [:show, :edit, :update, :destroy]

  # GET /work_order_attachments
  # GET /work_order_attachments.json
  def index
    @work_order_attachments = WorkOrderAttachment.all
  end

  # GET /work_order_attachments/1
  # GET /work_order_attachments/1.json
  def show
  end

  # GET /work_order_attachments/new
  def new
    @work_order_attachment = WorkOrderAttachment.new
  end

  # GET /work_order_attachments/1/edit
  def edit
  end

  # POST /work_order_attachments
  # POST /work_order_attachments.json
  def create
    @work_order_attachment = WorkOrderAttachment.new(work_order_attachment_params)

    respond_to do |format|
      if @work_order_attachment.save
        format.html { redirect_to @work_order_attachment, notice: 'Work order attachment was successfully created.' }
        format.json { render :show, status: :created, location: @work_order_attachment }
      else
        format.html { render :new }
        format.json { render json: @work_order_attachment.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_order_attachments/1
  # PATCH/PUT /work_order_attachments/1.json
  def update
    respond_to do |format|
      if @work_order_attachment.update(work_order_attachment_params)
        format.html { redirect_to @work_order_attachment, notice: 'Work order attachment was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_order_attachment }
      else
        format.html { render :edit }
        format.json { render json: @work_order_attachment.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_order_attachments/1
  # DELETE /work_order_attachments/1.json
  def destroy
    @work_order_attachment.destroy
    respond_to do |format|
      format.html { redirect_to work_order_attachments_url, notice: 'Work order attachment was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_order_attachment
      @work_order_attachment = WorkOrderAttachment.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_order_attachment_params
      params.require(:work_order_attachment).permit(:work_order_id, :attachment_id)
    end
end
