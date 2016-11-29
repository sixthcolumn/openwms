class WorkOrderHazardsController < ApplicationController
  before_action :set_work_order_hazard, only: [:show, :edit, :update, :destroy]

  # GET /work_order_hazards
  # GET /work_order_hazards.json
  def index
    @work_order_hazards = WorkOrderHazard.all
  end

  # GET /work_order_hazards/1
  # GET /work_order_hazards/1.json
  def show
  end

  # GET /work_order_hazards/new
  def new
    @work_order_hazard = WorkOrderHazard.new
  end

  # GET /work_order_hazards/1/edit
  def edit
  end

  # POST /work_order_hazards
  # POST /work_order_hazards.json
  def create
    @work_order_hazard = WorkOrderHazard.new(work_order_hazard_params)

    respond_to do |format|
      if @work_order_hazard.save
        format.html { redirect_to @work_order_hazard, notice: 'Work order hazard was successfully created.' }
        format.json { render :show, status: :created, location: @work_order_hazard }
      else
        format.html { render :new }
        format.json { render json: @work_order_hazard.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_order_hazards/1
  # PATCH/PUT /work_order_hazards/1.json
  def update
    respond_to do |format|
      if @work_order_hazard.update(work_order_hazard_params)
        format.html { redirect_to @work_order_hazard, notice: 'Work order hazard was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_order_hazard }
      else
        format.html { render :edit }
        format.json { render json: @work_order_hazard.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_order_hazards/1
  # DELETE /work_order_hazards/1.json
  def destroy
    @work_order_hazard.destroy
    respond_to do |format|
      format.html { redirect_to work_order_hazards_url, notice: 'Work order hazard was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_order_hazard
      @work_order_hazard = WorkOrderHazard.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_order_hazard_params
      params.require(:work_order_hazard).permit(:work_order_id, :hazard_id)
    end
end
