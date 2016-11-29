class WorkOrderSchedulesController < ApplicationController
  before_action :set_work_order_schedule, only: [:edit, :update, :destroy]

  # GET /work_order_schedules
  # GET /work_order_schedules.json
  def index
    @work_order_schedules = WorkOrderSchedule.all
  end

  # GET /work_order_schedules/1
  # GET /work_order_schedules/1.json
  # in this case, assume the id column is the work_order_id
  def show
    @work_order_schedules = WorkOrderSchedule.where('work_order_id = ?', params[:id])
  end

  # GET /work_order_schedules/new
  def new
    @work_order_schedule = WorkOrderSchedule.new
  end

  # GET /work_order_schedules/1/edit
  def edit
  end

  # POST /work_order_schedules
  # POST /work_order_schedules.json
  def create
    @work_order_schedule = WorkOrderSchedule.new(work_order_schedule_params)

    respond_to do |format|
      if @work_order_schedule.save
        format.html { redirect_to @work_order_schedule, notice: 'Work order schedule was successfully created.' }
        format.json { render :show, status: :created, location: @work_order_schedule }
      else
        format.html { render :new }
        format.json { render json: @work_order_schedule.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_order_schedules/1
  # PATCH/PUT /work_order_schedules/1.json
  def update
    respond_to do |format|
      if @work_order_schedule.update(work_order_schedule_params)
        format.html { redirect_to @work_order_schedule, notice: 'Work order schedule was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_order_schedule }
      else
        format.html { render :edit }
        format.json { render json: @work_order_schedule.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_order_schedules/1
  # DELETE /work_order_schedules/1.json
  def destroy
    @work_order_schedule.destroy
    respond_to do |format|
      format.html { redirect_to work_order_schedules_url, notice: 'Work order schedule was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_order_schedule
      @work_order_schedule = WorkOrderSchedule.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_order_schedule_params
      params.require(:work_order_schedule).permit(:work_order_id, :time_schedule_id)
    end
end
