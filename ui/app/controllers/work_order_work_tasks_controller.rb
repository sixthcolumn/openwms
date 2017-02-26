class WorkOrderWorkTasksController < ApplicationController
  before_action :set_work_order_work_task, only: [:show, :edit, :update, :destroy]

  # GET /work_order_work_tasks
  # GET /work_order_work_tasks.json
  def index
    @work_order_work_tasks = WorkOrderWorkTask.all
  end

  # GET /work_order_work_tasks/1
  # GET /work_order_work_tasks/1.json
  def show
  end

  # GET /work_order_work_tasks/new
  def new
    @work_order_work_task = WorkOrderWorkTask.new
  end

  # GET /work_order_work_tasks/1/edit
  def edit
  end

  # POST /work_order_work_tasks
  # POST /work_order_work_tasks.json
  def create
    @work_order_work_task = WorkOrderWorkTask.new(work_order_work_task_params)

    respond_to do |format|
      if @work_order_work_task.save
        format.html { redirect_to @work_order_work_task, notice: 'Work order work task was successfully created.' }
        format.json { render :show, status: :created, location: @work_order_work_task }
      else
        format.html { render :new }
        format.json { render json: @work_order_work_task.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_order_work_tasks/1
  # PATCH/PUT /work_order_work_tasks/1.json
  def update
    respond_to do |format|
      if @work_order_work_task.update(work_order_work_task_params)
        format.html { redirect_to @work_order_work_task, notice: 'Work order work task was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_order_work_task }
      else
        format.html { render :edit }
        format.json { render json: @work_order_work_task.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_order_work_tasks/1
  # DELETE /work_order_work_tasks/1.json
  def destroy
    @work_order_work_task.destroy
    respond_to do |format|
      format.html { redirect_to work_order_work_tasks_url, notice: 'Work order work task was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_order_work_task
      @work_order_work_task = WorkOrderWorkTask.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_order_work_task_params
      params.require(:work_order_work_task).permit(:work_order_id, :work_task_id)
    end
end
