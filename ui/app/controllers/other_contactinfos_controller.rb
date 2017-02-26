class OtherContactinfosController < ApplicationController
  before_action :set_other_contactinfo, only: [:show, :edit, :update, :destroy]

  # GET /other_contactinfos
  # GET /other_contactinfos.json
  def index
    @other_contactinfos = OtherContactinfo.all
  end

  # GET /other_contactinfos/1
  # GET /other_contactinfos/1.json
  def show
  end

  # GET /other_contactinfos/new
  def new
    @other_contactinfo = OtherContactinfo.new
  end

  # GET /other_contactinfos/1/edit
  def edit
  end

  # POST /other_contactinfos
  # POST /other_contactinfos.json
  def create
    @other_contactinfo = OtherContactinfo.new(other_contactinfo_params)

    respond_to do |format|
      if @other_contactinfo.save
        format.html { redirect_to @other_contactinfo, notice: 'Other contactinfo was successfully created.' }
        format.json { render :show, status: :created, location: @other_contactinfo }
      else
        format.html { render :new }
        format.json { render json: @other_contactinfo.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /other_contactinfos/1
  # PATCH/PUT /other_contactinfos/1.json
  def update
    respond_to do |format|
      if @other_contactinfo.update(other_contactinfo_params)
        format.html { redirect_to @other_contactinfo, notice: 'Other contactinfo was successfully updated.' }
        format.json { render :show, status: :ok, location: @other_contactinfo }
      else
        format.html { render :edit }
        format.json { render json: @other_contactinfo.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /other_contactinfos/1
  # DELETE /other_contactinfos/1.json
  def destroy
    @other_contactinfo.destroy
    respond_to do |format|
      format.html { redirect_to other_contactinfos_url, notice: 'Other contactinfo was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_other_contactinfo
      @other_contactinfo = OtherContactinfo.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def other_contactinfo_params
      params.require(:other_contactinfo).permit(:details, :info_type)
    end
end
