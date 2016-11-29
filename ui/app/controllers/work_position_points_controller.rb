class WorkPositionPointsController < ApplicationController
  before_action :set_work_position_point, only: [:show, :edit, :update, :destroy]

  # GET /work_position_points
  # GET /work_position_points.json
  def index
    @work_position_points = WorkPositionPoint.all
  end

  # GET /work_position_points/1
  # GET /work_position_points/1.json
  def show
  end

  # GET /work_position_points/new
  def new
    @work_position_point = WorkPositionPoint.new
  end

  # GET /work_position_points/1/edit
  def edit
  end

  # POST /work_position_points
  # POST /work_position_points.json
  def create
    @work_position_point = WorkPositionPoint.new(work_position_point_params)

    respond_to do |format|
      if @work_position_point.save
        format.html { redirect_to @work_position_point, notice: 'Work position point was successfully created.' }
        format.json { render :show, status: :created, location: @work_position_point }
      else
        format.html { render :new }
        format.json { render json: @work_position_point.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_position_points/1
  # PATCH/PUT /work_position_points/1.json
  def update
    respond_to do |format|
      if @work_position_point.update(work_position_point_params)
        format.html { redirect_to @work_position_point, notice: 'Work position point was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_position_point }
      else
        format.html { render :edit }
        format.json { render json: @work_position_point.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_position_points/1
  # DELETE /work_position_points/1.json
  def destroy
    @work_position_point.destroy
    respond_to do |format|
      format.html { redirect_to work_position_points_url, notice: 'Work position point was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_position_point
      @work_position_point = WorkPositionPoint.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_position_point_params
      params.require(:work_position_point).permit(:work_order_id, :sequence_num, :xposition, :yposition, :zposition)
    end
end
