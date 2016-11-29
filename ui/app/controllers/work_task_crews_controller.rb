class WorkTaskCrewsController < ApplicationController
  before_action :set_work_task_crew, only: [:show, :edit, :update, :destroy]

  # GET /work_task_crews
  # GET /work_task_crews.json
  def index
    @work_task_crews = WorkTaskCrew.all
  end

  # GET /work_task_crews/1
  # GET /work_task_crews/1.json
  def show
  end

  # GET /work_task_crews/new
  def new
    @work_task_crew = WorkTaskCrew.new
  end

  # GET /work_task_crews/1/edit
  def edit
  end

  # POST /work_task_crews
  # POST /work_task_crews.json
  def create
    @work_task_crew = WorkTaskCrew.new(work_task_crew_params)

    respond_to do |format|
      if @work_task_crew.save
        format.html { redirect_to @work_task_crew, notice: 'Work task crew was successfully created.' }
        format.json { render :show, status: :created, location: @work_task_crew }
      else
        format.html { render :new }
        format.json { render json: @work_task_crew.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_task_crews/1
  # PATCH/PUT /work_task_crews/1.json
  def update
    respond_to do |format|
      if @work_task_crew.update(work_task_crew_params)
        format.html { redirect_to @work_task_crew, notice: 'Work task crew was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_task_crew }
      else
        format.html { render :edit }
        format.json { render json: @work_task_crew.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_task_crews/1
  # DELETE /work_task_crews/1.json
  def destroy
    @work_task_crew.destroy
    respond_to do |format|
      format.html { redirect_to work_task_crews_url, notice: 'Work task crew was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_task_crew
      @work_task_crew = WorkTaskCrew.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_task_crew_params
      params.require(:work_task_crew).permit(:work_task_id, :crew_id)
    end
end
