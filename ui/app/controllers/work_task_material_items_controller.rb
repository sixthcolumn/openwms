class WorkTaskMaterialItemsController < ApplicationController
  before_action :set_work_task_material_item, only: [:show, :edit, :update, :destroy]

  # GET /work_task_material_items
  # GET /work_task_material_items.json
  def index
    @work_task_material_items = WorkTaskMaterialItem.all
  end

  # GET /work_task_material_items/1
  # GET /work_task_material_items/1.json
  def show
  end

  # GET /work_task_material_items/new
  def new
    @work_task_material_item = WorkTaskMaterialItem.new
  end

  # GET /work_task_material_items/1/edit
  def edit
  end

  # POST /work_task_material_items
  # POST /work_task_material_items.json
  def create
    @work_task_material_item = WorkTaskMaterialItem.new(work_task_material_item_params)

    respond_to do |format|
      if @work_task_material_item.save
        format.html { redirect_to @work_task_material_item, notice: 'Work task material item was successfully created.' }
        format.json { render :show, status: :created, location: @work_task_material_item }
      else
        format.html { render :new }
        format.json { render json: @work_task_material_item.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_task_material_items/1
  # PATCH/PUT /work_task_material_items/1.json
  def update
    respond_to do |format|
      if @work_task_material_item.update(work_task_material_item_params)
        format.html { redirect_to @work_task_material_item, notice: 'Work task material item was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_task_material_item }
      else
        format.html { render :edit }
        format.json { render json: @work_task_material_item.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_task_material_items/1
  # DELETE /work_task_material_items/1.json
  def destroy
    @work_task_material_item.destroy
    respond_to do |format|
      format.html { redirect_to work_task_material_items_url, notice: 'Work task material item was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_task_material_item
      @work_task_material_item = WorkTaskMaterialItem.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_task_material_item_params
      params.require(:work_task_material_item).permit(:work_task_id, :material_item_id)
    end
end
