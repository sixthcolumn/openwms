class WorkOrderLocationObjectRefsController < ApplicationController
  before_action :set_work_order_location_object_ref, only: [:show, :edit, :update, :destroy]

  # GET /work_order_location_object_refs
  # GET /work_order_location_object_refs.json
  def index
    @work_order_location_object_refs = WorkOrderLocationObjectRef.all
  end

  # GET /work_order_location_object_refs/1
  # GET /work_order_location_object_refs/1.json
  def show
  end

  # GET /work_order_location_object_refs/new
  def new
    @work_order_location_object_ref = WorkOrderLocationObjectRef.new
  end

  # GET /work_order_location_object_refs/1/edit
  def edit
  end

  # POST /work_order_location_object_refs
  # POST /work_order_location_object_refs.json
  def create
    @work_order_location_object_ref = WorkOrderLocationObjectRef.new(work_order_location_object_ref_params)

    respond_to do |format|
      if @work_order_location_object_ref.save
        format.html { redirect_to @work_order_location_object_ref, notice: 'Work order location object ref was successfully created.' }
        format.json { render :show, status: :created, location: @work_order_location_object_ref }
      else
        format.html { render :new }
        format.json { render json: @work_order_location_object_ref.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_order_location_object_refs/1
  # PATCH/PUT /work_order_location_object_refs/1.json
  def update
    respond_to do |format|
      if @work_order_location_object_ref.update(work_order_location_object_ref_params)
        format.html { redirect_to @work_order_location_object_ref, notice: 'Work order location object ref was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_order_location_object_ref }
      else
        format.html { render :edit }
        format.json { render json: @work_order_location_object_ref.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_order_location_object_refs/1
  # DELETE /work_order_location_object_refs/1.json
  def destroy
    @work_order_location_object_ref.destroy
    respond_to do |format|
      format.html { redirect_to work_order_location_object_refs_url, notice: 'Work order location object ref was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_order_location_object_ref
      @work_order_location_object_ref = WorkOrderLocationObjectRef.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_order_location_object_ref_params
      params.require(:work_order_location_object_ref).permit(:work_order_id, :loc_ref_object_id)
    end
end
