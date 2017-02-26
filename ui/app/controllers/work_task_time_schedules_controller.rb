class WorkTaskTimeSchedulesController < ApplicationController
  before_action :set_work_task_time_schedule, only: [ :edit, :update, :destroy]

  # GET /work_task_time_schedules
  # GET /work_task_time_schedules.json
  def index
    @work_task_time_schedules = WorkTaskTimeSchedule.all
  end

  # GET /work_task_time_schedules/1
  # GET /work_task_time_schedules/1.json
  # note that id in this case is the work_task_id
  def show
    @work_task_schedules = WorkTaskTimeSchedule.where('work_task_id = ?', params[:id])
  end

  # GET /work_task_time_schedules/new
  def new
    @work_task_time_schedule = WorkTaskTimeSchedule.new
  end

  # GET /work_task_time_schedules/1/edit
  def edit
  end

  # POST /work_task_time_schedules
  # POST /work_task_time_schedules.json
  def create
    @work_task_time_schedule = WorkTaskTimeSchedule.new(work_task_time_schedule_params)

    respond_to do |format|
      if @work_task_time_schedule.save
        format.html { redirect_to @work_task_time_schedule, notice: 'Work task time schedule was successfully created.' }
        format.json { render :show, status: :created, location: @work_task_time_schedule }
      else
        format.html { render :new }
        format.json { render json: @work_task_time_schedule.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_task_time_schedules/1
  # PATCH/PUT /work_task_time_schedules/1.json
  def update
    respond_to do |format|
      if @work_task_time_schedule.update(work_task_time_schedule_params)
        format.html { redirect_to @work_task_time_schedule, notice: 'Work task time schedule was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_task_time_schedule }
      else
        format.html { render :edit }
        format.json { render json: @work_task_time_schedule.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_task_time_schedules/1
  # DELETE /work_task_time_schedules/1.json
  def destroy
    @work_task_time_schedule.destroy
    respond_to do |format|
      format.html { redirect_to work_task_time_schedules_url, notice: 'Work task time schedule was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_task_time_schedule
      @work_task_time_schedule = WorkTaskTimeSchedule.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_task_time_schedule_params
      params.require(:work_task_time_schedule).permit(:work_task_id, :time_schedule_id)
    end
end
