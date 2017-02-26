class ContactpersonOtherContactinfosController < ApplicationController
  before_action :set_contactperson_other_contactinfo, only: [:show, :edit, :update, :destroy]

  # GET /contactperson_other_contactinfos
  # GET /contactperson_other_contactinfos.json
  def index
    @contactperson_other_contactinfos = ContactpersonOtherContactinfo.all
  end

  # GET /contactperson_other_contactinfos/1
  # GET /contactperson_other_contactinfos/1.json
  def show
  end

  # GET /contactperson_other_contactinfos/new
  def new
    @contactperson_other_contactinfo = ContactpersonOtherContactinfo.new
  end

  # GET /contactperson_other_contactinfos/1/edit
  def edit
  end

  # POST /contactperson_other_contactinfos
  # POST /contactperson_other_contactinfos.json
  def create
    @contactperson_other_contactinfo = ContactpersonOtherContactinfo.new(contactperson_other_contactinfo_params)

    respond_to do |format|
      if @contactperson_other_contactinfo.save
        format.html { redirect_to @contactperson_other_contactinfo, notice: 'Contactperson other contactinfo was successfully created.' }
        format.json { render :show, status: :created, location: @contactperson_other_contactinfo }
      else
        format.html { render :new }
        format.json { render json: @contactperson_other_contactinfo.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /contactperson_other_contactinfos/1
  # PATCH/PUT /contactperson_other_contactinfos/1.json
  def update
    respond_to do |format|
      if @contactperson_other_contactinfo.update(contactperson_other_contactinfo_params)
        format.html { redirect_to @contactperson_other_contactinfo, notice: 'Contactperson other contactinfo was successfully updated.' }
        format.json { render :show, status: :ok, location: @contactperson_other_contactinfo }
      else
        format.html { render :edit }
        format.json { render json: @contactperson_other_contactinfo.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /contactperson_other_contactinfos/1
  # DELETE /contactperson_other_contactinfos/1.json
  def destroy
    @contactperson_other_contactinfo.destroy
    respond_to do |format|
      format.html { redirect_to contactperson_other_contactinfos_url, notice: 'Contactperson other contactinfo was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_contactperson_other_contactinfo
      @contactperson_other_contactinfo = ContactpersonOtherContactinfo.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def contactperson_other_contactinfo_params
      params.require(:contactperson_other_contactinfo).permit(:contactperson_id, :other_contactinfo_id)
    end
end
