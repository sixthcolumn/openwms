class WorkOrdersController < ApplicationController
  before_action :set_work_order, only: [:show, :edit, :update, :destroy]

  # GET /work_orders
  # GET /work_orders.json
  def index
    @work_orders = WorkOrder.all
  end

  # GET /work_orders/1
  # GET /work_orders/1.json
  def show
  end

  # GET /work_orders/new
  def new
    @work_order = WorkOrder.new
  end

  # GET /work_orders/1/edit
  def edit
  end

  # POST /work_orders
  # POST /work_orders.json
  def create
    @work_order = WorkOrder.new(work_order_params)

    respond_to do |format|
      if @work_order.save
        format.html { redirect_to @work_order, notice: 'Work order was successfully created.' }
        format.json { render :show, status: :created, location: @work_order }
      else
        format.html { render :new }
        format.json { render json: @work_order.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_orders/1
  # PATCH/PUT /work_orders/1.json
  def update
    respond_to do |format|
      if @work_order.update(work_order_params)
        format.html { redirect_to @work_order, notice: 'Work order was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_order }
      else
        format.html { render :edit }
        format.json { render json: @work_order.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_orders/1
  # DELETE /work_orders/1.json
  def destroy
    @work_order.destroy
    respond_to do |format|
      format.html { redirect_to work_orders_url, notice: 'Work order was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_order
      @work_order = WorkOrder.unscoped.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_order_params
      params.require(:work_order).permit(:work_order_name, :created_by, :mRid, :kind, :request_datetime, :updated_by, :status, :status_kind, :priority_justification, :priority_rank, :priority_type, :comments, :description, :title, :request_contact_id, :address_id, :primary_object_ref_id, :grid_location, :location_comment, :location_contact_id, :gps_latitude, :gps_longitude, :gps_altitude, :internal_building_name, :internal_building_num, :internal_floor, :internal_room_num)
    end
end
