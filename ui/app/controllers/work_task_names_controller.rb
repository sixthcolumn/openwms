class WorkTaskNamesController < ApplicationController
  before_action :set_work_task_name, only: [:edit, :update, :destroy]

  # GET /work_task_names
  # GET /work_task_names.json
  def index
    @work_task_names = WorkTaskName.all
  end

  # GET /work_task_names/1
  # GET /work_task_names/1.json
  def show
    @work_task_names = WorkTaskName.where("work_task_id = ?", params[:id]);
  end

  # GET /work_task_names/new
  def new
    @work_task_name = WorkTaskName.new
  end

  # GET /work_task_names/1/edit
  def edit
  end

  # POST /work_task_names
  # POST /work_task_names.json
  def create
    @work_task_name = WorkTaskName.new(work_task_name_params)

    respond_to do |format|
      if @work_task_name.save
        format.html { redirect_to @work_task_name, notice: 'Work task name was successfully created.' }
        format.json { render :show, status: :created, location: @work_task_name }
      else
        format.html { render :new }
        format.json { render json: @work_task_name.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_task_names/1
  # PATCH/PUT /work_task_names/1.json
  def update
    respond_to do |format|
      if @work_task_name.update(work_task_name_params)
        format.html { redirect_to @work_task_name, notice: 'Work task name was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_task_name }
      else
        format.html { render :edit }
        format.json { render json: @work_task_name.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_task_names/1
  # DELETE /work_task_names/1.json
  def destroy
    @work_task_name.destroy
    respond_to do |format|
      format.html { redirect_to work_task_names_url, notice: 'Work task name was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_task_name
      @work_task_name = WorkTaskName.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_task_name_params
      params.require(:work_task_name).permit(:name, :work_task_id, :name_type_id)
    end
end
