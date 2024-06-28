class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder str = new StringBuilder();
        if(id != null) str.append("[").append(id).append("]").append(" - ");
        if(name != null) str.append(name).append(" - ");
        if(department != null) {
            str.append(department.toUpperCase());
        } else {
            str.append("OWNER");
        }
        return str.toString();
    }
}
