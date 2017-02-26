class ProxyInterfacesController < ApplicationController
  before_action :set_proxy_interface, only: [:show, :edit, :update, :destroy]

  # GET /proxy_interfaces
  # GET /proxy_interfaces.json
  def index
    @proxy_interfaces = ProxyInterface.all
  end

  # GET /proxy_interfaces/1
  # GET /proxy_interfaces/1.json
  def show
  end

  # GET /proxy_interfaces/new
  def new
    @proxy_interface = ProxyInterface.new
  end

  # GET /proxy_interfaces/1/edit
  def edit
  end

  # POST /proxy_interfaces
  # POST /proxy_interfaces.json
  def create
    @proxy_interface = ProxyInterface.new(proxy_interface_params)

    respond_to do |format|
      if @proxy_interface.save
        format.html { redirect_to @proxy_interface, notice: 'Proxy interface was successfully created.' }
        format.json { render :show, status: :created, location: @proxy_interface }
      else
        format.html { render :new }
        format.json { render json: @proxy_interface.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /proxy_interfaces/1
  # PATCH/PUT /proxy_interfaces/1.json
  def update
    respond_to do |format|
      if @proxy_interface.update(proxy_interface_params)
        format.html { redirect_to @proxy_interface, notice: 'Proxy interface was successfully updated.' }
        format.json { render :show, status: :ok, location: @proxy_interface }
      else
        format.html { render :edit }
        format.json { render json: @proxy_interface.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /proxy_interfaces/1
  # DELETE /proxy_interfaces/1.json
  def destroy
    @proxy_interface.destroy
    respond_to do |format|
      format.html { redirect_to proxy_interfaces_url, notice: 'Proxy interface was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_proxy_interface
      @proxy_interface = ProxyInterface.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def proxy_interface_params
      params.require(:proxy_interface).permit(:interface_id, :proxy_url)
    end
end
