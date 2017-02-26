class EprilogsController < ApplicationController
  before_action :set_eprilog, only: [:show, :edit, :update, :destroy]

  # GET /eprilogs
  # GET /eprilogs.json
  def index
    @eprilogs = Eprilog.all
  end

  # GET /eprilogs/1
  # GET /eprilogs/1.json
  def show
  end

  # GET /eprilogs/new
  def new
    @eprilog = Eprilog.new
  end

  # GET /eprilogs/1/edit
  def edit
  end

  # POST /eprilogs
  # POST /eprilogs.json
  def create
    @eprilog = Eprilog.new(eprilog_params)

    respond_to do |format|
      if @eprilog.save
        format.html { redirect_to @eprilog, notice: 'Eprilog was successfully created.' }
        format.json { render :show, status: :created, location: @eprilog }
      else
        format.html { render :new }
        format.json { render json: @eprilog.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /eprilogs/1
  # PATCH/PUT /eprilogs/1.json
  def update
    respond_to do |format|
      if @eprilog.update(eprilog_params)
        format.html { redirect_to @eprilog, notice: 'Eprilog was successfully updated.' }
        format.json { render :show, status: :ok, location: @eprilog }
      else
        format.html { render :edit }
        format.json { render json: @eprilog.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /eprilogs/1
  # DELETE /eprilogs/1.json
  def destroy
    @eprilog.destroy
    respond_to do |format|
      format.html { redirect_to eprilogs_url, notice: 'Eprilog was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_eprilog
      @eprilog = Eprilog.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def eprilog_params
      params.require(:eprilog).permit(:address, :contentType, :create_date, :data, :encoding, :faultCode, :header, :httpMethod, :message, :messageId, :operation, :payload, :responseCode, :resultCode, :INTERFACE_ID, :stage)
    end
end
