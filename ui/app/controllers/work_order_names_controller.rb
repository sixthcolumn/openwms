class WorkOrderNamesController < ApplicationController
  before_action :set_work_order_name, only: [ :edit, :update, :destroy]

  # GET /work_order_names
  # GET /work_order_names.json
  def index
    @work_order_names = WorkOrderName.all
  end

  # GET /work_order_names/1
  # GET /work_order_names/1.json
  def show
    @workordernames = WorkOrderName.where("work_order_id = ?", params[:id]);
  end

  # GET /work_order_names/new
  def new
    @work_order_name = WorkOrderName.new
  end

  # GET /work_order_names/1/edit
  def edit
  end

  # POST /work_order_names
  # POST /work_order_names.json
  def create
    @work_order_name = WorkOrderName.new(work_order_name_params)

    respond_to do |format|
      if @work_order_name.save
        format.html { redirect_to @work_order_name, notice: 'Work order name was successfully created.' }
        format.json { render :show, status: :created, location: @work_order_name }
      else
        format.html { render :new }
        format.json { render json: @work_order_name.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_order_names/1
  # PATCH/PUT /work_order_names/1.json
  def update
    respond_to do |format|
      if @work_order_name.update(work_order_name_params)
        format.html { redirect_to @work_order_name, notice: 'Work order name was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_order_name }
      else
        format.html { render :edit }
        format.json { render json: @work_order_name.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_order_names/1
  # DELETE /work_order_names/1.json
  def destroy
    @work_order_name.destroy
    respond_to do |format|
      format.html { redirect_to work_order_names_url, notice: 'Work order name was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_order_name
      @work_order_name = WorkOrderName.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_order_name_params
      params.require(:work_order_name).permit(:name, :name_type_id, :work_order_id)
    end
end
